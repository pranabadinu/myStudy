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
				echo x
				echo y
			}
		}
		stage('ActorName') {
			steps {
				myVariables 'Pranab'
			}
		}
	}
}
