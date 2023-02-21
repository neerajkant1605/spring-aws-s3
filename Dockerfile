FROM openjdk:18.0.2.1
ARG JAR_FILE=target/*.jar
COPY ./target/spring-aws-s3-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]