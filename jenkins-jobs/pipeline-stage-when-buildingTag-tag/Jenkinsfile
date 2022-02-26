pipeline {
    agent any
	
    stages {
        stage('Build') {
		
			when{
				tag "release-*"
			}
		
            steps {                
                echo 'Hello World building tag'
            }
        }
    }
}