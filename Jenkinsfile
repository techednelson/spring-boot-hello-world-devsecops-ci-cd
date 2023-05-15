pipeline {
    agent any
    stages {
        stage("Build Artifact") {
            steps {
                sh "mvn clean package -DskipTests=true"
                archive "target/*.jar"
            }
        }
        stage('Unit Tests - JUnit and Jacoco') {
            steps {
                sh "mvn test"
            }
            post {
                always {
                  junit 'target/surefire-reports/*.xml'
                  jacoco execPattern: 'target/jacoco.exec'
                }
            }
        }
        stage('Docker Build and Push') {
            steps {
                withDockerRegistry([credentialsId: "dockerhub", url: "https://registry.hub.docker.com"]) {
                  sh 'printenv'
                  sh 'docker build -t webtechnelson/devsecops-application:""$GIT_COMMIT"" .'
                  sh 'docker push webtechnelson/devsecops-application:""$GIT_COMMIT""'
                }
            }
        }
    }
}