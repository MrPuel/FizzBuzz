pipeline { 
    agent any  
    stages { 
        stage ('UnitTests') {
            /*steps {
                sh 'mvn test' 
            }
            post {
                success {
                    echo 'ca marche bg' 
                }
            }*/
            steps
               {
                script
                 {
                  if (isUnix()) 
                   {
                    sh 'mvn --batch-mode resources:testResources compiler:testCompile surefire:test'
                   }
                  else
                   {
                    bat 'mvn --batch-mode resources:testResources compiler:testCompile surefire:test'
                   }
                 }
               }
        }
    }
    

}
