pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
