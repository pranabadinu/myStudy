pipeline {
	agent any
	stages {
		stage('Morning') {
			steps {
				echo "Jenkins Workspace DIR"
				def currentDir = pwd()
				echo currentDir				
			}
		}
		stage('Day') {
			steps {
				echo "Do Work"
			}
		}
		stage('Night') {
			steps {
				echo "BYE"
			}
		}
	}
}
			
