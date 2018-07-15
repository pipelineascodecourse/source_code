pipeline{			
    agent any

    stages{
        stage('Build'){	
			input{
                    message "Please specify environment:"			
                    ok "OK"
					submitter "dummyuser,admin@localhost.com"
					submitterParameter "whoIsSubmitter"
                    parameters {
						string(name: 'environment', defaultValue: 'Dev', description: 'Environment to build for (Valid values: Dev, Test, Prod)')
						string(name: 'version', defaultValue: '1.0', description: 'Version number to build for')
						booleanParam(name: 'to_deploy_to_environment', defaultValue: true, description: '')
						choice(choices: 'US-EAST-1\nUS-WEST-2', description: 'What AWS region?', name: 'region')
						text(name:'myText', defaultValue:'myTextValue', description:'myText')
						password(name:'myPassword', defaultValue:'myPasswordValue', description:'myDescription')
						file(name:'myFile', description:'fileDescription')
						credentials(name:'myCredentials', description:'myCredentailsDesc', required:true)
                    }
                }			
            			
            steps{			
				echo "We are building for ${environment}, ${version}, and we are deploying to environment: ${to_deploy_to_environment}"
				echo "region:${region}, myText: ${myText}, myPassword: ${myPassword}, and myFile: ${myFile}"
				echo "submitter is: ${whoIsSubmitter}"
				echo "selected credentials is: ${myCredentials}"
			}
        }			
    }			
}				
