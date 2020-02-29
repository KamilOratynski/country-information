# Country Information

/** <br/>
&nbsp;&nbsp;&nbsp;\* author Kamil Oratyński<br/>
&nbsp;&nbsp;&nbsp;*/<br/>

The application that allows you to view country information by specific country code.
<br/>Example  GET- http:/localhost:8080/BHR return:<br/>
{<br/>
    "name": "Bahrain"<br/>
    "continent": "Asia"<br/>
    "population":617000<br/>
    "life_expectancy":73<br/>
    "country_language":"Arabic"<br/>
}

###Run application:
run database: https://github.com/ghusta/docker-postgres-world-db (port in this project - localhost:7777)<br/>
this project in cmd: mvn clean compile package <br/>
in main folder where is Dockrefile, cmd: docker build -f Dockerfile -t country:v1 . <br/>
and next in cmd: docker run -p 8081:8080 "image id"<br/>
last step: open browser at localhost:8080/code<br/>
code - select country code


Technologies:
* Java 8
* Spring (Spring Boot, Spring Web, Spring JPA)
* PostgreSQL
* Docker

Library:
* Lombok

<img src="https://res.cloudinary.com/dvxbeoob5/image/upload/v1582991097/example_get_qz8u3n.png">