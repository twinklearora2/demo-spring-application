FROM bellsoft/liberica-openjdk-alpine:17

RUN mkdir -p /opt/application
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/application
WORKDIR /opt/application
EXPOSE 8080
CMD java -jar demo-0.0.1-SNAPSHOT.jar