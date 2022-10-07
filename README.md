# Consumer

Application which you can use for saving as much as you want numbers.
Then you can get mean of numbers consumed by application in the last 5 minutes.

We implement web REST application, withe methods save and mean based on spring-boot with h2db. If you want change time
period of average calculation you should go to application.properties and change setting consumer.average-time-period(
seconds)

# Technologist

- Java (11)
- Spring Boot (2.7.4)
- H2database (2.1.214)
- Spring Boot Jdbc (2.6.6)
- Lombok (1.18.12)
- Swagger (3.0.0)
- Maven (3.8.6)

# Environment

- JRE (Java Runtime Environment) average
- Maven

# Build/Start

[Download](https://github.com/yarovoy-it/consumer) application from git repository. Then we have same option:

- One of them start application from project folder. You should go to root folder (example c:/work-space/consumer or any
  other path), and then start by script in terminal.

  mvn spring-boot:run

Or

    mvn clean package

then you should see folder target and use this script

    java -jar target/consumer-1.0.0.jar

### Start with script without build

- (Windows) Go to consumer/build and run script run.bat

- (UNIX) Go to consumer/build and run script run.linux.sh

# Swagger

After application has launched. You can use [swagger](http://localhost:8080/swagger-ui/).

# Postman collection
Path to postman collection: consumer/build/Consumer postman_collection.json



