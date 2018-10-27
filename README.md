# spring-cloud-stream-employee-service: Spring Cloud Stream - Publish Message to RabbitMQ

Deploying Spring Cloud Data Flow Local Serve. Please floow th below steps.

1.  Download the Spring Cloud Data Flow Server and Shell apps:
    I am using 1.7.0 version in my local.
http://repo.spring.io/release/org/springframework/cloud/spring-cloud-dataflow-server-local/

2.  Launch the Data Flow Server.

3.  Since the Data Flow Server is a Spring Boot application, you can run it just by using java -jar.
    a.  java -jar <jarname>
    
4.  Launch the shell: java -jar <jarname>

5.  Register a Stream App with the App Registry using the Spring Cloud Data Flow Shell.Please run the below steps:

app register --name employee-service-app --type app --uri maven://com.gsrk.employee:employee-service:jar:0.0.1-SNAPSHOT
stream create --name emp-service-app-log-data --definition 'employee-service-app'
stream deploy --name emp-service-app-log-data
