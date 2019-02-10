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

public class Symbol {
   public int sym;
   public int parse_state;
   boolean used_by_parser;
   public int left;
   public int right;
   public Object value;

   public Symbol(int var1) {
      this(var1, -1);
      this.left = -1;
      this.right = -1;
      this.value = null;
   }

   Symbol(int var1, int var2) {
      this.used_by_parser = false;
      this.sym = var1;
      this.parse_state = var2;
   }

   public Symbol(int var1, int var2, int var3) {
      this(var1, var2, var3, (Object)null);
   }

   public Symbol(int var1, int var2, int var3, Object var4) {
      this(var1);
      this.left = var2;
      this.right = var3;
      this.value = var4;
   }

   public Symbol(int var1, Object var2) {
      this(var1, -1, -1, var2);
   }

   public String toString() {
      return "#" + this.sym;
   }
}
