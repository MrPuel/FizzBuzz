pipeline { 
    agent any  
    stages { 
        stage ('Build') {
            steps {
                sh 'mvn test' 
            }
            post {
                success {
                    echo 'ca marche bg' 
                }
            }
        }
    }
    

}
