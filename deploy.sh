#!/bin/bash
 
sudo docker image rm -f   keycloak-customentity-keycloak
mvn clean install
sudo docker compose  up
