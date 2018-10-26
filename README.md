# spring-cloud-stream-employee-service

Spring Cloud Stream - Publish Message to RabbitMQ

Register a Stream App with the App Registry using the Spring Cloud Data Flow Shell

Please run the below steps:
app register --name employee-service-app --type app --uri maven://com.gsrk.employee:employee-service:jar:0.0.1-SNAPSHOT
stream create --name emp-service-app-log-data --definition 'employee-service-app'
stream deploy --name emp-service-app-log-data
