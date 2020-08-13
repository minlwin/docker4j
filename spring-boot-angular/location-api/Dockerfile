FROM openjdk:8-jre-alpine

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]