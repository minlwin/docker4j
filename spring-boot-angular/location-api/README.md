# Spring Boots API Project

We have to run spring application both on local and cloud environment. So we need to use profiles.

## Profiles

### Dev Profile

This profile use local postgreSQL database sever and Production profile use docker container database. So that we have to configure run configuration for local IDE. Please note that!!.

Please add Parameter to run configuration.
```
--spring.profiles.active=dev
```
DONT Forget this!

Database Connection for Dev Profile
```
spring.datasource.url=jdbc:postgresql://localhost:5432/location
```

### Production Profile
In production mode, Spring application will run on Docker Container and also Database Server will run on own docker container.
```
spring.datasource.url=jdbc:postgresql://location-postgres:5432/location
spring.datasource.username=location
spring.datasource.password=location
```


## Docker File
```
FROM openjdk:8-jre-alpine

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY target/*.jar app.jar
EXPOSE 8080/tcp

ENTRYPOINT ["java","-jar", "/app.jar"]
```

## Build Docker Image
```
docker build -t minlwin/location-api .
```

## Run Docker Container
```
docker run -d --name location-api --network location minlwin/location-api
```

