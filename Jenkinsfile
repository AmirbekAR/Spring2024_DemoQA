pipeline {
    agent any

    parameters {
        string(name: 'TEST_GROUP', defaultValue: 'UI')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/AmirbekAR/Spring2024_DemoQA.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn install'
            }
        }

        stage('Run Smoke Tests') {
            steps {
                sh "mvn test -DsuiteXmlFile=src/test/resources/test_suites/smoke_suite.xml"
            }
        }

        stage('Allure Report') {
            steps {
                sh 'mvn allure:report'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
        }
    }
}
