FROM bellsoft/liberica-openjdk-alpine:17

COPY target/*.jar /opt/
EXPOSE 8080
CMD java -jar demo-0.0.1-SNAPSHOT.jar
