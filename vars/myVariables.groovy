#!/usr/bin/env groovy
def varTemp = "Hello"
//varName is a String variable with default value 'Person'
def call( String varName = 'Person' ) {
  echo "Hello. The name of person is, ${varName}."
}
