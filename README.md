Running The App Locally

-prerequisite : 
	maven should be installed on your environment maven home should be addd to env varialbes.

The following command should be executed and it will quickly compile and run the application.
$ mvn spring-boot:run

You might also want to use the useful operating system env variable:
$ export MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=128M
