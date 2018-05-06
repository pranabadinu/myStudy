#!/usr/bin/env groovy


//varName is a String variable with default value 'Person'
def call( String varName = 'Person' ) {
  echo "Hello. The name of person is, ${varName}."
  //invoke the function
  addition ( 5 , 6 )
  //invoke function defined in  foo.groovy
  foo.devLang("PYTHON")
  foo.scriptLang('perl', 'python')
}

//arithmetic function. datatype : int
def addition (int a=1, int b=2) {
  echo "Addition is ${a+b}"
}

def subtraction () {
  echo "Subtraction to be done"
}

