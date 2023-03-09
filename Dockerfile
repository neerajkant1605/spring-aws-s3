FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/spring-aws-s3.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]