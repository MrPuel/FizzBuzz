pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
