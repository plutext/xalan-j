/**
 * Decompiled CUP runtime code linked with the generated parser;
 * runtime code is subject to the following license
 * 
 * CUP Parser Generator Copyright Notice, License, and Disclaimer Copyright
 * 1996-2015 by Scott Hudson, Frank Flannery, C. Scott Ananian, Michael Petter
 * Permission to use, copy, modify, and distribute this software and its
 * documentation for any purpose and without fee is hereby granted, provided
 * that the above copyright notice appear in all copies and that both the
 * copyright notice and this permission notice and warranty disclaimer appear in
 * supporting documentation, and that the names of the authors or their
 * employers not be used in advertising or publicity pertaining to distribution
 * of the software without specific, written prior permission.
 * 
 * The authors and their employers disclaim all warranties with regard to this
 * software, including all implied warranties of merchantability and fitness. In
 * no event shall the authors or their employers be liable for any special,
 * indirect or consequential damages or any damages whatsoever resulting from
 * loss of use, data or profits, whether in an action of contract, negligence or
 * other tortious action, arising out of or in connection with the use or
 * performance of this software. *
 */
package java_cup.runtime;

import java.util.Stack;

public class virtual_parse_stack {
   protected Stack real_stack;
   protected int real_next;
   protected Stack vstack;

   public virtual_parse_stack(Stack var1) throws Exception {
      if (var1 == null) {
         throw new Exception("Internal parser error: attempt to create null virtual stack");
      } else {
         this.real_stack = var1;
         this.vstack = new Stack();
         this.real_next = 0;
         this.get_from_real();
      }
   }

   public boolean empty() {
      return this.vstack.empty();
   }

   protected void get_from_real() {
      if (this.real_next < this.real_stack.size()) {
         Symbol var1 = (Symbol)this.real_stack.elementAt(this.real_stack.size() - 1 - this.real_next);
         ++this.real_next;
         this.vstack.push(new Integer(var1.parse_state));
      }
   }

   public void pop() throws Exception {
      if (this.vstack.empty()) {
         throw new Exception("Internal parser error: pop from empty virtual stack");
      } else {
         this.vstack.pop();
         if (this.vstack.empty()) {
            this.get_from_real();
         }

      }
   }

   public void push(int var1) {
      this.vstack.push(new Integer(var1));
   }

   public int top() throws Exception {
      if (this.vstack.empty()) {
         throw new Exception("Internal parser error: top() called on empty virtual stack");
      } else {
         return (Integer)this.vstack.peek();
      }
   }
}
