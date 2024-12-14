FROM openjdk:21-jdk-slim
COPY target/GithubActionDemo-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]