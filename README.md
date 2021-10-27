# Spring Kafka Rest example
Sample application with Spring Boot, Spring-kafka and Spring-web

- Creating a kafka producer and consumer
- Creating an endpoint that produces a message

## How to
### Starting Apache Kafka with Zookeeper using docker-compose
```
cd docker/
docker-compose up -d
```

### Run the application
Run KafkaRestApplication.java

or

`mvn spring-boot:run`

### Submit a message
`curl -X POST -F 'message=test' http://localhost:9000/kafka/publish`