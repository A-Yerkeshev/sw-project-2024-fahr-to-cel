pipeline {
     agent any
         stages {
             stage('Checkout') {
                 steps {
                    git branch: 'main', url: 'git@github.com:A-Yerkeshev/sw-project-2024-fahr-to-cel.git'
                 }
             }
             stage('Build') {
                 steps {
                    bash 'mvn clean install'
                 }
             }
             stage('Test') {
                 steps{
                    bash 'mvn test'
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