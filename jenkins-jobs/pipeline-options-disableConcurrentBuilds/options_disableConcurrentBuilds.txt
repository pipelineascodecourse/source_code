pipeline {	
    agent any	
    //options {	
    //    disableConcurrentBuilds()	
    //}	
    stages {	
        stage('Build') {	
            steps {	
                sleep(time: 10, unit: 'SECONDS') 	
                echo 'Hello World'	
            }	
        }	
    }	
}	
