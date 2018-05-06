#!/usr/bin/env groovy
/*********
Bedefault call() method is exposed as the main entry to this groovy.
If another method say- functionA is defined in this groovy then that method need to invoke explicitly like: reuseFunctions.functionA 
from JenkinsFile stage.
*********/
def call () {
  echo "the main call method of reuseFunctions"
}

def functionA() {
  echo "some local function which can be reused"
}
