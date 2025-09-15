pipeline {
    agent any

    tools {
        maven 'Maven-3.9.10'     // Name you configured in Jenkins → Global Tool Configuration
        jdk 'Java-21'           // Name you configured in Jenkins → Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/CodingMannu/rahulshetty_updated.git',
                    // credentialsId: 'your-git-credentials-id'
            }
        }

        stage('Build & Test') {
            steps {
                sh "mvn clean test -DsuiteXmlFile=master.xml"
            }
        }

        stage('Reports') {
            steps {
                // For TestNG / Cucumber reports
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/surefire-reports',
                    reportFiles: 'index.html',
                    reportName: 'TestNG Report'
                ])
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
