@Library('myStudy') _
pipeline {
	agent any
	stages {
		stage('Morning') {
			steps {
				echo "Jenkins Workspace DIR"
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
			}
		}
		stage('ActorName') {
			steps {
				myVariables 'Pranab'
			}
		}
	}
}
