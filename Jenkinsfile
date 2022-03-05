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
      discordSend description: "Jenkins Pipeline Build ", footer: ":-)", link: env.BUILD_URL, result: currentBuild.currentResult, title: "BUILD SUCESS", webhookURL: "https://discord.com/api/webhooks/902202707111202816/kX4y4jqmq-gwmeKKsR62LcvlQjFpUNNGrjsOaDODvGKUJD2ure7YVrUo2jvmUpqKlxrF"
    }
  }
}
