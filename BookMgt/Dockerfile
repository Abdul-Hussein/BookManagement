# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the build jar file into the container at /app
COPY target/BookMgt-0.0.1-SNAPSHOT.jar /app/BookMgt.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "BookMgt.jar"]
