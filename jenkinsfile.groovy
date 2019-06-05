node {
	stage('SonarQube analysis') {
   // ws('C:\\Apps\\Jenkins\\jobs\\trial') {
    // requires SonarQube Scanner 2.8+
    def scannerHome = tool 'Sonar Runner';
		
    sh """
                ${scannerHome}/bin/sonar-scanner \
                  -Dsonar.host.url=http://35.197.99.120:9000 \
                  -Dsonar.login=admin \
		  -Dsonar.password=admin
                """
    }
  
}

