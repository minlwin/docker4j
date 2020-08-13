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
docker run -d --name location-postgres minlwin/location-postgres

### Run Container within a network
docker run -d --name location-postgres  --network location minlwin/location-postgres

### Detach from a network

### Attach to a network


## Connect to Container

docker exec -it location-postgres ash

## Stop Container

docker stop location-postgres
