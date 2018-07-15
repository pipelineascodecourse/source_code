pipeline {
    agent any

    stages {
        stage('Build') {
		    tools {
				maven 'maven3_5_2' 
				//maven 'maven3_0_5' 
			}
            steps {
                sh 'mvn --version'
            }
        }
    }
}


