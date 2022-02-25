// retry
// -----
// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 retry(3) {
// 					echo "before throwing error"
//                     error "error in retry"
//                 }
                
//                 echo "after retry(3)"
//             }
//         }
//     }
// }

// timeouts
// --------
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                timeout(time: 1, unit: 'SECONDS') //DAYS,HOURS,MICROSECONDS ,MILLISECONDS ,MINUTES ,NANOSECONDS ,SECONDS 
				{
                    echo "sleeping in timeout"
                    sleep 2
                }
            }
        }
    }
}

retry->timeout
--------------
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                retry(3) {
				    timeout(time: 1, unit: 'SECONDS') {
							sleep 2
					}
                    echo "after timeout"
                }
            }
        }
    }
}
