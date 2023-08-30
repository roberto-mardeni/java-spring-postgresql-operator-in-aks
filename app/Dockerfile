# A multi-stage Docker build for a Spring Boot application
# Build stage
FROM maven:3.8.7-openjdk-18-slim AS build
COPY pom.xml .
COPY src ./src
RUN mvn package

# Run stage
FROM openjdk:17-oracle
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar ./demo.jar
CMD ["java", "-Xmx200m", "-jar", "demo.jar"]
EXPOSE 8080
