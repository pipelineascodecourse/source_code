node{	
	properties(
		[
			pipelineTriggers(
				[
					pollSCM('* * * * *')
				]
			),
		]
	)
        stage('Build') {				
			checkout([$class: 'GitSCM', 				
			branches: [[name: "origin/master"]], 
			userRemoteConfigs: [[
			url: 'https://github.com/pipelineascodecourse/scripted-pollSCM.git']]])
        }		
}
