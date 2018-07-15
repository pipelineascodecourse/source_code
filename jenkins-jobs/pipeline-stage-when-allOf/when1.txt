

pipeline {
    agent any
	environment{
		version="1.0"
		some_name="jeff"
	}
    stages {
        stage("Build") {
            when {
                allOf { 
					environment name: "version", value: "1.0"
					environment name: "some_name", value: "jeff"
				}
            }
            steps {
                echo "Building allOf ${version} ${some_name}"
            }
        }
    }
}

