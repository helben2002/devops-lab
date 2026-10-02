pipeline {
    agent any

    tools {
        jdk 'jdk25'
    }

    stages {
        stage('Test') {
            steps {
                sh 'java -version'
                sh './mvnw test'
            }
        }

        stage('Package') {
            steps {
                sh './mvnw package -DskipTests'
            }
        }
    }
}