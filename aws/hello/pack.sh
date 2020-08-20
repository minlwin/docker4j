#!/bin/sh
cd hello-app

LINE="=================================="

echo $LINE
echo "Start Packing"

echo "Clean Angular Last Build Files"
rm -rf dist/

echo "Build Angular Project"
echo $LINE

ng b --prod

echo $LINE
echo "Copy Angular to Spring Boots Project"
cp dist/hello-app/* ../hello-api/src/main/resources/static/

echo "Compile Spring API Project"
echo $LINE
cd ../hello-api
mvn install

cd ../

echo $LINE
echo "Initialize Docker Contaiers"
echo $LINE
docker stop aws-hello
docker rm aws-hello
docker rmi minlwin/aws-hello

echo $LINE
echo "Build Docker Image"
echo $LINE
docker build -t minlwin/aws-hello .

echo $LINE
echo "Run Docker Container"
echo $LINE

docker run -d -p 8080:8080 --name aws-hello minlwin/aws-hello

echo $LINE
echo "Check Docker Container"
echo $LINE
docker ps -a
