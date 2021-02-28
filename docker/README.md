
## Purpose
Purpose of the docker image is for development, testing and setting demo environment.

**Note** : image is not suitable for production environment!

##  Build

First build AS4Mail artefacts

    cd ${AS4MAIL_HOME}
    mvn clean install

Build image 

    docker build -f ./docker/Dockerfile -t as4mail .


Run image

     docker run  -p 8080:8080 --name as4mail_demo  as4mail


AS4Mail is accessible on URL:

    http://localhost:8080/laurentius-web/
