FROM openjdk:8-jre-alpine

COPY target/lib /usr/share/app/lib
COPY target/embedded-jsp.jar /usr/share/app

WORKDIR /usr/share/app

RUN mkdir base

ENTRYPOINT [ "java", "-jar", "embedded-jsp.jar" ]