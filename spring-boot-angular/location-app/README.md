# Angular Project

Angular Project is running on separate container. There will be CORS Error when angular request information from API. So we need to add Reverse Proxy in Nginx server.

## Production Environment
```
export const environment = {
  production: true,
  baseApi: '/api'
};
```

## Build Angular Project

```
ng b --prod
```

## Reverse Proxy Configuration

```
    location /api/ {
        proxy_pass http://location-api:8080/;
        proxy_http_version 1.1;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Connection 'upgrade';
        proxy_set_header Host $host;
        proxy_cache_bypass $http_upgrade;        
    }  
```

## Dockerfile

```
FROM nginx:alpine
COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY dist/location-app/* /usr/share/nginx/html/
```

## Build Docker Image

```
docker build -t minlwin/location-app .
```

## Run Docker Image

```
docker run -d -p 80:80 --name location-app --network location minlwin/location-app
```