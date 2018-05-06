@Library('myStudy') _
pipeline {
	agent any
	stages {
		stage('Morning') {
			steps {
				echo "Jenkins Workspace DIR"
				commonMathFunctions 'add' 'sub'
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
	}
}
