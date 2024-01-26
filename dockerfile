# Use a Java base image 
FROM openjdk:17-oracle
# Set the working directory to /app 
WORKDIR /app
# Copy the Spring Boot application JAR file into the Docker image 
COPY target/cicd-demo-0.0.1-SNAPSHOT.jar /app/cicd-demo-0.0.1-SNAPSHOT.jar
# Expose the port that the Spring Boot application is listening on 
EXPOSE 5000
# Run the Spring Boot application when the container starts 
CMD ["java", "-jar", "cicd-demo-0.0.1-SNAPSHOT.jar"]