FROM openjdk:8-jre-alpine

RUN addgroup -S spring \ 
    && adduser -S spring -G spring \
    && mkdir /usr/share/data \
    && chown spring:spring /usr/share/data

USER spring:spring

VOLUME [ "/usr/share/data" ]

COPY hello-api/target/*.jar app.jar
EXPOSE 8080/tcp

ENTRYPOINT ["java", "-jar", "/app.jar"]