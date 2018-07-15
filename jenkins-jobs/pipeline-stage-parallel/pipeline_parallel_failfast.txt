----------------
parallel example
----------------
pipeline {
    agent any
    stages {
        stage('Stages Running in Parallel') {
            failFast true
            parallel {
                stage('Stage1') {
                    steps {
                        echo "Stage1 executing"
                        sleep 10
                    }
                }
                stage('Stage2') {
                    steps {
                        echo "Stage2 executing"
                        sleep 10
                    }
                }
                stage('Stage3') {
                    steps {
                        echo "Stage3 executing"
                        sleep 10
                    }                    
                }
            }
        }
    }
}

----------------
sequential example
----------------
pipeline {
    agent any
    stages {
		stage('Stage1') {
			steps {
				echo "Stage1 executing"
				sleep 10
			}
		}
		stage('Stage2') {
			steps {
				echo "Stage2 executing"
				sleep 10
			}
		}
		stage('Stage3') {
			steps {
				echo "Stage3 executing"
				sleep 10
			}                    
		}
    }
}

----------------
failfast example
----------------
pipeline {
    agent any
    stages {
		stage('Stages Running in Parallel') {
            failFast true
            parallel {
                stage('Stage1') {
                    steps {
                        echo "Stage1 executing"
                        sleep 10
                    }
                }
                stage('Stage2') {
                    steps {
                        echo "Stage2 executing"
                        sleep 2
						error 'simulating error happened on Stage2'
                    }
                }
                stage('Stage3') {
                    steps {
                        echo "Stage3 executing"
                        sleep 10
                    }                    
                }
            }
        }	
    }
}