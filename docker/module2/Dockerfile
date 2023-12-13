# multiplication-service Dockerfile
FROM openjdk:8-jdk-alpine
COPY ././module2/target/*.jar /app/
WORKDIR /app
CMD ["java", "-jar", "module2-1.0-SNAPSHOT.jar", "--spring.profiles.active=docker"]