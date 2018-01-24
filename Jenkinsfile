node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository

      sh "/usr/bin/git clone 'https://docker-04.tainet:3000/dvotino/jenkins-demo.git' project"

      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.
      mvnHome = tool 'Local Maven'
   }
   stage('Build') {
      // Run the maven build
      dir('project') {
        sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      }

   }
   stage('Results') {
      dir('project') {
        archive 'target/*.war'
      }

   }
}