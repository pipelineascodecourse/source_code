// Positive example
// ----------------
pipeline{
    agent any
    stages{
        stage("Build"){
			options{
				retry(3)
			}
            steps{
                echo "Before error statement"
                error "Error statement just got executed"
                echo "After error statement"
            }
        }
    }
}

// Negative example
// ----------------
pipeline{
    agent any
    stages{
        stage("Build"){
			options{
				retry(3)
			}
            steps{
                echo "Before setting current build to FAILURE"
                script {
                    currentBuild.result = 'FAILURE'
                }
				echo "After setting current build to FAILURE"
            }
        }
    }
}


