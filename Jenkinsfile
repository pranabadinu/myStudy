pipeline {
	agent any
	stages {
		stage('HI') {
			steps {
				echo "Jenkins Workspace DIR"
				def currentDir=pwd()
				echo currentDir				
			}
		}
		stage('WORK') {
			steps {
				echo "Do Work"
			}
		}
		stage('BYE') {
			steps {
				echo "BYE"
			}
		}
	}
}
			
