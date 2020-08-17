# Docker Image for PostgreSQL

## Docker File
```
FROM postgres:alpine

ENV POSTGRES_DB=words
ENV POSTGRES_USER=words
ENV POSTGRES_PASSWORD=words

EXPOSE 5432/tcp
```

## Build Docker Image
```
docker build -t minlwin/proxy-db .
```

## Run Docker Image
```
docker run -d --name proxy-db -v proxy-database:/var/lib/postgresql/data minlwin/proxy-db 
```

## Connect to Container
```
docker exec -it proxy-db ash
```