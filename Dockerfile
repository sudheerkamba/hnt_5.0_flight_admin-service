FROM openjdk:latest
EXPOSE 8080
ADD target/flight-admin.jar api.jar
ENTRYPOINT ["sh","-c","java -jar /api.jar"]