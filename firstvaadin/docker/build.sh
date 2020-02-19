#!/bin/bash

echo "Build Application"
cd ..
mvn clean package
echo "Copy Application to Docker folder"
cd docker
cp ../target/first-vaadin-1.0-SNAPSHOT.war ./

echo "Build Docker Image"
docker build -t hello .

echo "Remove Docker Container with same name"
docker rm -f hello

echo "Start Docker Image"
docker run -d -p 8080:8080 --name hello hello

