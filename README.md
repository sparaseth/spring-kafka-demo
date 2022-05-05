# spring-kafka-demo

## start zookeeper
zookeeper-server-start.bat {kafka.home}\config\zookeeper.properties

## start kafka broker
kafka-server-start.bat {kafka.home}\config\server.properties

## create topic:
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic skptech. 
Note - This topic has been created through code. 

## consume messages
kafka-console-consumer.bat --topic skptech --from-beginning --bootstrap-server localhost:9092

## produce message
kafka-console-producer.bat --broker-list localhost:9092 --topic skptech

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

1. Start zookeeper
2. Starte kafka broker
3. Build the project using `mvn clean install`
4. Run using `mvn spring-boot:run`
5. Start consumer(to check the messages from consumer terminal)

