pipeline {
     agent any
        tools {
            maven 'Maven 3.3.9'
            jdk 'jdk8'
        }
         stages {
             stage('Checkout') {
                 steps {
                    git branch: 'main', url: 'git@github.com:A-Yerkeshev/sw-project-2024-fahr-to-cel.git'
                 }
             }
             stage('Build') {
                 steps {
                    sh 'mvn clean install'
                 }
             }
             stage('Test') {
                 steps{
                    sh 'mvn test'
                 }
                 post {
                     success {
                         // Publish JUnit test results
                         junit '**/target/surefire-reports/TEST-*.xml'
                         // Generate JaCoCo code coverage report
                         jacoco(execPattern: '**/target/jacoco.exec')
                     }
                 }
             }
         }
}