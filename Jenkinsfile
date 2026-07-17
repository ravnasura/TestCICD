pipeline{
 agent {
        docker {
            image 'maven:3.9.9-eclipse-temurin-17'
        }
    }

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

 stage('Package') {
            steps {
                echo 'Build completed successfully'
            }
        }



}

}