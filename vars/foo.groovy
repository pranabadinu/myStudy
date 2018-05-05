#!/usr/bin/env groovy


//varName is a String variable with default value 'Person'
def call ( String varName = 'Person' ) {
  echo "Hello. The name of person is, ${varName}."
  display 'INR' 
}

def display (String country = 'India' ) {
   echo "Country is India"
}
