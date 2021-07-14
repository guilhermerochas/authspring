# authspring

Spring Project with Auth, Health Checks and Postgres connection

# About the Project

This is just a simple project used for studing and personal achievements, trying to 
use the best patterns related to Spring and Java in general.
This Project:
 - (TODO) Uses JWT Token for basic API Authentication
 - Exposes a Health Check API for consulting health of database and application
 - Uses STORED Procedures (Functions) for SQL JOINS via JPA
 - Uses docker-compose for building the images and starting the containers

# How to run

I made a configuration file for easy run, you just have to execute it on your *NIX 
machine with the following command:

```bash
  ./run.sh -d # or just `./run.sh` for a development build or 
  ./run.sh -p # to package it to production with docker compose
```

# Routes

### `/api/company`

 - Method: GET
 - Status Code
    - 200 --> Returns the company records
    - 400 --> If an error occourred in the process

### `/api/company/{id:int}`

- Method: GET
- Status Code
    - 200 --> Returns the company record that matches with the id
    - 204 --> If a company record with the passed id was not found
    - 400 --> If an error occurred in the process

### `/api/user`

- Method: GET
- Status Code
    - 200 --> Returns the company users records
    - 400 --> If an error occurred in the process

### `/api/user/{id:int}`

- Method: GET
- Status Code
    - 200 --> Returns the user record that matches with the id
    - 204 --> If a company record with the passed id was not found
    - 400 --> If an error occurred in the process

### `/api/user/usercontact`

- Method: GET
- Status Code
    - 200 --> returns a join result of the users and companies associated with them
    - 400 --> If an error occurred in the process

### `/actuator/health`

- Method: GET
- Status Code
  - 200 --> Returns the health check about the running instance