pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
			
				script{
				
					def name = "jeff"
					
					if(name == "jeff")
						println("hi ${name}")
					else
						println("hi human")				
												
					sleep 2	
					echo "end of script"
				}
            }
        }
    }
}

