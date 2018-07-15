
pipeline {
    agent any
	environment{
		version="1.0"
	}
    stages {
        stage("Build") {
            when {
                expression { 
					version == "1.0" 
				}
            }
            steps {
                echo "Building ${version}"
            }
        }
    }
}

