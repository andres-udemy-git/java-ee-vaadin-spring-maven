#!/bin/bash

BASEDIR=$(dirname "$0")
cd $BASEDIR/..

echo "Building Application"
mvn clean package
cp univers-web/target/univers-web-1.3.6.RELEASE.war docker/univers-web.war

echo "Build Docker Image"
docker build -t univers-image docker

echo "Remove Docker Container with same name"
docker rm -f univers

echo "Start Docker Image"
docker run -d -p 8080:8080 -p 9990:9990 --name univers -it univers-image  /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0