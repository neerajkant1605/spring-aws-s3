pipeline {

    agent any

    tools {
        maven 'Maven3'
        jdk 'jdk-11'
        }

    stages
    {
        stage ('Starter step') {
            steps {
                echo 'Process begins now'
            }
        }
        stage ('Checkout') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'e00b3522-3ccd-472d-a4ba-487da773ae09', url: 'https://github.com/neerajkant1605/spring-aws-s3']])
            }
        }

        stage ('Build') {
            steps {
                echo 'Building starts now'
                bat """
                mvn clean install
                """
            }
        }

        stage ('Stop & Remove Container') {

             steps {

                echo 'Stop & Remove Container Process start'
                bat """
                docker rm -f s3app
                """
            }

        }

        stage ('Delete old image') {

             steps {

                echo 'Delete old image process start'
                bat """
                docker image rm spring-aws-s3
                """
            }

        }

        stage ('Build Docker Image') {

            steps {

                echo 'Building docker image starts'
                bat """
                docker build -t spring-aws-s3 .
                """
            }
        }

        stage ('Run docker container') {

            steps {

                echo 'Building docker container start'
                bat """
                docker run -d --network "external-api" --name "s3app" -p 8000:8081  spring-aws-s3
                """
            }
        }

    }

}
