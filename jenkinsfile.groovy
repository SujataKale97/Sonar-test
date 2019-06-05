node {
	stage('SonarQube analysis') {
   // ws('C:\\Apps\\Jenkins\\jobs\\trial') {
    // requires SonarQube Scanner 2.8+
    def scannerHome = tool 'Sonar Runner';
    withSonarQubeEnv('Sonar') {
	   bat "gradlew -Dsonar.analysis.mode "
     // bat "${scannerHome}/StartSonar.bat"
    }
  
}
}