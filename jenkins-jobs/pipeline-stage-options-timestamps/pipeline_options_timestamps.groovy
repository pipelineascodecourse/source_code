stage level
--------------

pipeline{
    agent any

    stages{
        stage('Build'){
		    options { 
				timestamps() 
			}
            steps{
                echo "Hello World in Build"
                echo "Hello World in Build Again"
            }
        }
		
        stage('Test'){

            steps{
                echo "Hello World in Test"
                echo "Hello World in Test Again"
            }
        }		
    }
}

pipeline level
--------------

pipeline{
    agent any

	options { 
		timestamps() 
	}	
	
    stages{
        stage('Build'){

            steps{
                echo "Hello World"
                echo "Hello World Again"
            }
        }
	
        stage('Test'){

            steps{
                echo "Hello World in Test"
                echo "Hello World in Test Again"
            }
        }		
    }		
}

