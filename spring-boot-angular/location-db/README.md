# PostgreSQL DB Image

## Dockerfile

FROM postgres:13-alpine

ENV POSTGRES_DB=location
ENV POSTGRES_USER=location
ENV POSTGRES_PASSWORD=location

EXPOSE 5432/tcp

## Build Docker Images

docker build -t minlwiin/location-postgres .


## Run Docker Image

docker run -d --name location-pgs minlwin/location-postgres


## Connect to Container

docker exec -it location-pgs ash
