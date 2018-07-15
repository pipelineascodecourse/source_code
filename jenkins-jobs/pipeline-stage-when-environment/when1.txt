pipeline {
    agent any
	environment{
		DEPLOY_TO='production'
	}
    stages {
        stage('Build') {
            when {
                environment name: 'DEPLOY_TO', value: 'production'
            }

            steps {
                echo 'Deploying'
            }
        }
    }
}


