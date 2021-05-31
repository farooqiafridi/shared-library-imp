pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Deploy') {
            when {
                branch 'production'
                environment name: 'DEPLOY_TO', value: 'production'
            }
            steps {
                echo 'Deploying'
            }
        }
    }
}
