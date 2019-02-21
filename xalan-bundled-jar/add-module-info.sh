#!/usr/bin/env bash
javac --patch-module xalan_bundled_jar=target/$1 module-info.java
jar uf target/$1  module-info.class
echo "module-info.java injected into $1"
