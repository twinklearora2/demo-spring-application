properties([pipelineTriggers([githubPush()])])

pipeline{
	agent any
    stages {
    	stage("Build Project"){
    	    git branch: 'main', credentialsId: 'github-username-password', url: 'https://github.com/twinklearora2/demo-spring-application'
        	sh "mvn clean install"
        }
        stage("Build Docker Image"){
            sh 'docker build -t spring-service .'
        }
        stage("Run Docker Image"){
            sh 'docker rm -f spring-service; docker run -p 8090:8090 --name spring-service spring-service'
        }
    }
}
