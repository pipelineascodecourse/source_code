pipeline {
    agent any

    stages {
        stage('Build') {
		    tools {
				maven 'maven3_6_1' 
				//maven 'maven3_0_5' 
			}
            steps {
                sh 'mvn --version'
            }
        }
    }
}


