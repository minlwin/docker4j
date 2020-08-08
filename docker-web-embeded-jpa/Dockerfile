FROM tomcat:9.0.37-jdk8-openjdk-slim-buster

RUN mkdir /var/hsqldb

RUN chmod 777 /var/hsqldb

COPY ./target/application.war /usr/local/tomcat/webapps/