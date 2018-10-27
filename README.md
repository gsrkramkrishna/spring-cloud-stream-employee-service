# spring-cloud-stream-employee-service: Spring Cloud Stream - Publish Message to RabbitMQ

Deploying Spring Cloud Data Flow Local Serve. Please floow th below steps.

1.  Download the Spring Cloud Data Flow Server and Shell apps:
    I am using 1.7.0 version in my local.
http://repo.spring.io/release/org/springframework/cloud/spring-cloud-dataflow-server-local/

2.  Launch the Data Flow Server.

3.  Data Flow Server is a Spring Boot application, Launch Data Flow Server: java -jar "jar name"
    Ex: java -jar spring-cloud-dataflow-server-local-1.7.0.BUILD.jar
    
    https://user-images.githubusercontent.com/32461306/47600301-d25ad200-d9dc-11e8-8c28-6e8adbaa90df.PNG
     
4.  Launch the shell: java -jar "jar name"
    Ex: java -jar spring-cloud-dataflow-shell-1.7.0.BUILD.jar
    
    https://user-images.githubusercontent.com/32461306/47600330-4c8b5680-d9dd-11e8-837d-fea88ea81b2a.PNG)

5.  Register a Stream App with the App Registry using the Spring Cloud Data Flow Shell.Please run the below steps:
    a.  app register --name employee-service-app --type app --uri maven://com.gsrk.employee:employee-service:jar:0.0.1-SNAPSHOT
    b.  stream create --name emp-service-app-log-data --definition 'employee-service-app'
    c.  stream deploy --name emp-service-app-log-data
