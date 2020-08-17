FROM openjdk:8-jre-alpine

COPY target/*.jar app.jar
EXPOSE 8080/tcp

ENTRYPOINT ["java","-jar", "/app.jar"]