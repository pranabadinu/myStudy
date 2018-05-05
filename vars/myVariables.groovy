#!/usr/bin/env groovy


//varName is a String variable with default value 'Person'
def call( String varName = 'Person' ) {
  echo "Hello. The name of person is, ${varName}."
  //invoke the function
  addition ( 5 , 6 )
}

//arithmetic function. datatype : int
def addition (int a=1, int b=2) {
  echo "Addition is ${a+b}"
}

def subtraction (int x=10, int y=8) {
  echo "Subtraction is ${x-y}"
}

