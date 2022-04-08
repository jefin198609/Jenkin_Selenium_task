def path = "C:/ProgramData/Jenkins/.jenkins/workspace/JenkinSeleniumTask/src/test/java/TestProject/TestCase.java"

pipeline 
{
  agent any											
	  stages 										
	    {
        stage('build') 						
          {
            steps									
              {
	       bat "mvn clean install"
               //bat "javac $WORKSPACE/src/test/java/TestProject/TestCase.java" 
              }
          }
      }
}
