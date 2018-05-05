#!/usr/bin/env groovy


//varName is a String variable with default value 'Person'
def call( String varName = 'Person' ) {
  echo "Hello. The name of person is, ${varName}."
  addition ( 5 , 6 )
}

def addition (int a=1, int b=2) {
  echo "Addition is ${a+b}"
}

