#!/usr/bin/env groovy

/* mathematical functions which can be used by Jenkins pipeline 
*/

def call (String func1= 'add' , String func2= 'sub' ) {
  echo "The invoked function1 is ${func1} and function2 is ${func2}
}
