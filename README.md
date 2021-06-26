# authspring

Spring Project with Auth, Health Checks and Postgres connection

# About the Project

This is just a simple project used for studing and personal achievements, trying to 
use the best patterns related to Spring and Java in general.
This Project:
 - (TODO) Uses OAuth2 for basic API Authentication
 - (TODO) Exposes a Health Check API for consulting health of database and application
 - Uses STORED Procedures (Functions) for SQL JOINS via JPA
 - Uses docker-compose for building the images and starting the containers

# How to run

you can either use gradle or `./gradlew` for building the `bootJar`.
after that you can just:
```bash
  docker-compose up -d
```
