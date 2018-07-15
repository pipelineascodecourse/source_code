pipeline {
    agent any

    stages {
        stage('Build') {
		    options {
				timeout(time: 1, unit: 'SECONDS')  //values: NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS
			}
            steps {
                echo 'Hello World'
				sleep 2
            }
        }
    }
}
