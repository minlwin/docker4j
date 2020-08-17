# Docker Demo

This project will learn how to create containers and how to configure network for host to connect containers.

In this project there are 3 containers.

1. Spring Boots API Project
2. Angular Project
3. PostgreSQL Database

## Create Network

```
docker network create location
docker network ls
```

## Run PostgreSQL Container
```
docker run -d --name location-postgres  --network location  minlwin/location-postgres
```

## Run Spring API Container
```
docker run -d --name location-api --network location minlwin/location-api
```

## Run Angular App Container
```
docker run -d  -p 80:80 --name location-app --network location minlwin/location-app
```

## Inspect Network  
```
docker network inspect location
```