# spring-aws-s3

## Docker
    Create docker network
    docker network: create external-api
    Run docker compose to pull wiremock image

    Run wiremock image with name and network tab as below
    docker run --network "external-api" --name "wiremock" -p 7443:8443 -p 7070:8080 wiremock/wiremock

## Wiremock
    Run docker compose file (docker-compose up d-)

## Restart gpg
    gpgconf --kill gpg-agent

## Steps to create and run Image in docker:
    1.  Create Dockerfile with configs
    2.  Update pom file for artifact names as below
        <groupId>com.example.com</groupId>
	    <artifactId>spring-aws-s3</artifactId>
	    <version>0.0.1</version>
	    <name>spring-aws-s3</name>
    3.  Clean previous states (Removes existing target folder): Mvn> Lifecycle > Clean
    4.  Create artifacts : Mvn> Lifecycle > install (We should see artifacts in target folder now)
    5.  Build image - docker build -t spring-aws-s3 .
    6.  Run image - docker run --network "external-api" --name "s3app" -p 8000:8081  spring-aws-s3 (use name and network tab)
    7.  Ensure to replace localhost with app name in your app
        http://wiremock:8080/wiremock something    
         

## Jenkins Pipeline
    Installation and Integrationn with Github (Point to remeber)
    > Ensure compatible versions of Java is installed
    > Install using .war
    > U: jenkinsankay P: Usual (Futuara****$)
    > Ensure JAVA_HOME is defined in Dashboard> Manage Jenkins> Global Tool Configurations> JDK (Same as your machine).
    > Start Jenkins if stopped: net start jenkins

## Docker Jenkins Integration
    > Create jenkins file in pipeline and commit to SCM -- testing
    > 
    
    
    




