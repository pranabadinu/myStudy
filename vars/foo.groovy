#!/usr/bin/env groovy


//varName is a String variable with default value 'Person'
def call ( String varName = 'Person' ) {
  echo "Hello. The name of person is, ${varName}."
  devLang 'JAVA'
  scriptLang ( shell, perl )
}

//function with one arg
def devLang (String lang = 'C' ) {
  echo "Language is ${lang}"
}
//function with more arg
def scriptLang (String scpt1, String scpt2) {
  echo "Two Scripts are ${scpt1} and ${scpt2}"
}
