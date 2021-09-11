## Overview 
Simple application Gradle / Docker (build & run from source). It should connect to the
database and expose health-check endpoint.


## Tasks
1. Dockerfile for `hc-engine-app`
2. Provide a definition for `hc-engine-app` inside the file
   `docker-compose.yml`
   

### Running the java application 
In order to run the application please follow instruction below:
Build (fatjar):
`gradle clean build`
Run:
`gradle bootRun` 

### Running postgresql
`docker-compose -f docker-compose.yml up`
Postgres should run on `localhost` login: `postgres` pass: `postgres`

## Expectations
After running `docker-compose -f docker-compose.yml up`, then the endpoint `http://localhost:8080/actuator/health` should return status 200.


