pipeline{
 agent any

stages{

stage('Checkout') {
            steps {
                echo 'Checking source code'
            }
         }

 stage('Build') {
            steps {
                echo 'Building application'
                sh 'mvn clean package'
            }
        }

 stage('Docker Build') {
            steps {
                echo 'Building Docker Image'
                sh 'docker build -t practice-app:latest .'
            }
        }

 stage('Package') {
            steps {
                echo 'Build completed successfully'
            }
        }



}

}
