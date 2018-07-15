

pipeline {
    agent any
	environment{
		version="2.0"
		some_name="jeff"
	}
    stages {
        stage("Build") {
            when {
                anyOf { 
					environment name: "version", value: "1.0"
					environment name: "some_name", value: "jeff"
				}
            }
            steps {
                echo "Building anyOf ${version} ${some_name}"
            }
        }
    }
}

