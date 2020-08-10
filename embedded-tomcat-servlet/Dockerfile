FROM openjdk:8-jre-alpine

COPY target/lib /usr/share/app/lib

COPY target/embedded-tomcat-servlet-1.0.jar /usr/share/app

ENV TOM_BASE=/usr/share/app/base
RUN mkdir ${TOM_BASE}

ENTRYPOINT [ "java", "-jar", "/usr/share/app/embedded-tomcat-servlet-1.0.jar" ]