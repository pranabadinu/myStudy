#!/usr/bin/env groovy
/*********
Bedefault call() method is exposed as the main entry to this groovy.
If another method say- functionA is defined in this groovy then call() method can invoke that functionA method.
*********/
def call () {
  echo "the main call method of reuseFunctions"
  functionA
}

def functionA() {
  echo "some local function which can be reused"
}
