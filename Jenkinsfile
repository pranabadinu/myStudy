@Library('myStudy') _
pipeline {
	agent any
	stages {
		stage('parallelStage starts') {
		parallel{	
		stage('Morning') {
			steps {
				echo "Jenkins Workspace DIR"
				commonFunctions 'add'
				echo pwd()
			}
		}
		stage('DayJob') {
			steps {
				echo "Trigger another Jenkins job named JobThird"
				build job: 'JobThird'
			}
		}
		stage('Night') {
			steps {
				echo "BYE"
				foo 'hello'
			}
		}
		stage('ActorName') {
			steps {
				myVariables 'Pranab'
			}
		}
		stage('scriptSectionIntroduce') {
		  	steps {
			   script{
			      foo.devLang 'SQL'
			   }
			}
		}
		}
		}
		stage('Dummy statement') {
			steps{
				echo "do nothing"
			}
		}
	}
}
