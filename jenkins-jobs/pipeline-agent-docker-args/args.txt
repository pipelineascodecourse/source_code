pipeline {
    agent {
        docker {
            image 'maven:3.5.3-jdk-10-slim'
			args '-e someEnv=dev'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo $someEnv'
            }
        }
    }
}