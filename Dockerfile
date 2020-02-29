FROM openjdk:8u242-jdk

RUN apt-get update && \
    apt-get install -y vim && \
    apt-get install -y iputils-ping && \
    apt-get install -y curl

ADD target/country-1.jar .
EXPOSE 8081

CMD java -jar country-1.jar
