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
     post {
    success {
      echo "success path"
      discordSend description: "Jenkins Pipeline Build {Projet de BG}", footer: "Start Build", link: "http://pas_de_link.com", result: currentBuild.currentResult, title: "Hello bg", webhookURL: "https://discord.com/api/webhooks/912284109198491678/JSWgHNcVAeu_hIQcZNIC3AsxQmrbr__4JEiIP0WLtC9RPBIU-plnMP9V6W78QuTKkjim"
    }
  }
}
