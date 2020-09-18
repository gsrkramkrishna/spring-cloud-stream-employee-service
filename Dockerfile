FROM openjdk:8
ADD target/employee-service-0.0.1-SNAPSHOT.jar employee-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "employee-service.jar"]
