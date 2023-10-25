# User Microservice

This a microservice for user registration that connect with a [email-microservice](https://github.com/MatheusVict/User-Service-spring) for send user email

### Technologies used

* [Java](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjSuM7AlZGCAxXrHbkGHQ7wBvAQFnoECAgQAQ&url=https%3A%2F%2Fwww.oracle.com%2Fjava%2Ftechnologies%2Fjavase%2Fjdk17-archive-downloads.html&usg=AOvVaw0MQaf_m65M8kTWE8aBzB1g&opi=89978449)
* [Spring](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiI2pLRlZGCAxVELbkGHXsEAL4QFnoECAwQAQ&url=https%3A%2F%2Fspring.io%2F&usg=AOvVaw0su4qRS3HDogD-AnPOyXi1&opi=89978449)
* [MySQL](https://www.mysql.com/)
* [RabbitMQ](https://www.rabbitmq.com/)

## Dependencies

* Java - Version: 17
* Spring - Version: 3.1.5

### Getting start

```
mvn clean pakage -Dspring.rabbitmq.addresses=your_host_url
```
After that:

```
mvn spring-boot:run -Dspring.rabbitmq.addresses=your_host_url
```
And then, you see logs with message ```Started application on port 8081```
And you can open in [localhost:8081](http://localhost:8081)


## Http routes

## Register user
> POST

Body:

```json
{
  "name": "Jonh Doe",
  "Email": "user@email.com"
}
```

Return:

```json
{
  "userId": "3faf6131-4fa4215-51fasfd",
  "name": "Jonh Doe",
  "Email": "user@email.com"
}
```

And then you will receive in your email inbox the message:

```
Olá, Jonh Doe! Seu cadastro foi realizado com sucesso!
```
