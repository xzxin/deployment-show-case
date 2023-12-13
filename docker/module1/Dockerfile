# multiplication-service Dockerfile
FROM openjdk:8-jdk-alpine
COPY ././module1/target/*.jar /app/
WORKDIR /app
CMD ["java", "-jar", "module1-1.0-SNAPSHOT.jar", "--spring.profiles.active=docker"]