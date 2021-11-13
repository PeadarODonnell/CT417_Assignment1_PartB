pipeline {
    agent any
    stages {
        stage('the cleaning stage') {
            steps {
                bat 'gradle.bat clean'
            }
        }
        stage('the building stage') {
            steps {
                bat 'gradle.bat build'
            }
        }
        stage('the assembling stage') {
            steps {
                bat 'gradle.bat assemble'
            }
        }
        stage('the running stage, run main class') {
            steps {
                bat 'gradle.bat war'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'build/libs/*.war', fingerprint: true
        }
    }
}