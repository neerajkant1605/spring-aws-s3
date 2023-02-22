# spring-aws-s3

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
    6.  Run image - docker run -p 8000:8080 spring-aws-s3

## Jenkins Pipeline



