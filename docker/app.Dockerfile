FROM openjdk:8-alpine

WORKDIR /app
COPY ./build/libs/project-1.0.0.jar /app/project.jar

ENTRYPOINT ["java", "-jar", "project.jar"]
EXPOSE 8080