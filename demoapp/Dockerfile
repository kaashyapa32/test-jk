FROM openjdk:8
ADD target/spring-github-jenkins-docker-0.0.1-SNAPSHOT.jar testspring.jar
ENTRYPOINT ["java", "-jar", "testspring.jar"]