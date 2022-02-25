pipeline{
    agent {
        label "UBUNTU-20"
    }
    stages{
        stage("Build"){
            steps{
                echo "Hello World"
            }
        }
    }
}