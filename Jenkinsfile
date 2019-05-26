pipeline {
    agent any

    tools {
        maven 'mvn-3.6.1'
    }

    options {
        buildDiscarder(logRotator(numToKeepStr: '6'))
    }

    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                jacoco(
                    execPattern: 'target/**/*.exec',
                    classPattern: 'target/classes',
                    sourcePattern: 'src/main/java',
                    exclusionPattern: 'src/test*,**/com/yangsh/jacoco/*',
                    skipCopyOfSrcFiles: false,
                    changeBuildStatus: false,
                    minimumLineCoverage: '30', maximumLineCoverage: '70',
                    buildOverBuild: false
                )
            }
        }


    }

    post {
        always {
            cleanWs()
        }
    }
}