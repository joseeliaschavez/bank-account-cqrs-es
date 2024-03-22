# Bank Account Command API

![Github Actions Status](https://github.com/joseeliaschavez/bank-account-command-api/actions/workflows/gradle.yml/badge.svg?branch=develop&event=push)

An example SpringBoot microservice showcasing the CQRS and Event Sourcing architecture patterns.
This API accepts mutation events for mythical user bank accounts.

## Getting Started

### Kafka

The external Kafka service is defined as a standalone service in the `docker-compose.yml` file. Previously you had to 
also define a dependency on Zookeeper; the latest image can run independent with its own controller. 
See this [documentation](https://hub.docker.com/r/bitnami/kafka) for more details.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.3/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#web)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#messaging.kafka)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#data.nosql.mongodb)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
