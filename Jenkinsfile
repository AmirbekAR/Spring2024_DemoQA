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

        stage('Run Tests') {
            steps {
                // Запускаем тесты с использованием параметра TEST_GROUP
                sh "mvn test -P${params.TEST_GROUP}"
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
