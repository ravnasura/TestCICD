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

 stage('Package') {
            steps {
                echo 'Build completed successfully'
            }
        }



}

}
