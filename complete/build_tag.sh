#!/bin/bash

## DockerImageを調べてタグ打つのが面倒なのでスクリプトにした

./mvnw spring-boot:build-image -DskipTests=true
IMAGE_ID=`docker image ls | grep 'securing-web-complete' | awk '{print $3}'`
docker tag ${IMAGE_ID} akiraabe/spring-boot-docker:v226-3