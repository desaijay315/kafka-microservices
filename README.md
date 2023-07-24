

# Kafka Consumer and Producer

This repository contains code examples for implementing a Kafka consumer and producer in a Spring Boot application.

## Kafka Producer

The Kafka producer is responsible for publishing messages to Kafka topics. It uses the following configuration:

### KafkaProducerConfig.java

The `KafkaProducerConfig` class is a configuration class that sets up the necessary configuration for the Kafka producer. It includes the following:

- `bootstrapServers`: This field is populated with the value of the property `spring.kafka.bootstrap-servers` from the configuration properties file.
- `producerConfig()`: This method returns a `Map` of producer configurations, including the bootstrap servers, key serializer, and value serializer.


The provided code is a configuration class for a Kafka producer in a Spring Boot application. Let's break it down:

1. Import Statements:
   - `org.apache.kafka.clients.producer.ProducerConfig`: This class provides constants for configuring the producer.
   - `org.apache.kafka.common.serialization.StringSerializer`: This class serializes objects of type `String` to bytes.

2. Annotations:
   - `@Configuration`: This annotation indicates that the class is a configuration class and should be processed by the Spring container.

3. Field:
   - `@Value("${spring.kafka.bootstrap-servers}")`: This annotation injects the value of the property `spring.kafka.bootstrap-servers` from the configuration properties file into the `bootstrapServers` field.

4. Method:
   - `producerConfig()`: This method returns a `Map` of producer configurations.
   - Configuration properties are set in the `props` map using constant keys from `ProducerConfig`.
   - `ProducerConfig.BOOTSTRAP_SERVERS_CONFIG`: Specifies the list of Kafka brokers to connect to. It is set to the value of `bootstrapServers` field.
   - `ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG`: Specifies the serializer class for the message key. In this case, it's set to `StringSerializer`.
   - `ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG`: Specifies the serializer class for the message value. Also set to `StringSerializer`.
   - The `props` map is returned to be used as Kafka producer configuration.


## Kafka Consumer

The Kafka consumer is responsible for subscribing to Kafka topics and processing incoming messages. It uses the following configuration:

### KafkaConsumerConfig.java

The `KafkaConsumerConfig` class is a configuration class that sets up the necessary configuration for the Kafka consumer. It includes the following:

- `bootstrapServers`: This field is populated with the value of the property `spring.kafka.bootstrap-servers` from the configuration properties file.
- `consumerConfig()`: This method returns a `Map` of consumer configurations, including the bootstrap servers, group ID, key deserializer, and value deserializer.

### KafkaMessageListener.java

The `KafkaMessageListener` class is a Spring `@Component` that listens to Kafka topics and processes incoming messages. It includes the following:

- `@KafkaListener` annotation: This annotation is used to specify the Kafka topic(s) to listen to and the method to handle the incoming messages.
- `@Payload` annotation: This annotation is used to specify the payload of the Kafka message.
- `@Headers` annotation: This annotation is used to specify any headers associated with the Kafka message.

## Getting Started

To run the Kafka consumer and producer examples, follow these steps:

1. Clone the repository: `git clone <repository_url>`
2. Configure the Kafka properties in the `application.properties` file.
