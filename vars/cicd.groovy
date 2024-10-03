def gitDownload(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
} 

def buildArtifact()
{
   sh 'mvn pacakage'
}

def deploytomcat(jobname,ip,context)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}  
   
