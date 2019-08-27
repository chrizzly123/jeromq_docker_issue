FROM openjdk:13-alpine
WORKDIR /app
COPY target/docker-issue.jar .
CMD ["java", "-jar", "docker-issue.jar"]
