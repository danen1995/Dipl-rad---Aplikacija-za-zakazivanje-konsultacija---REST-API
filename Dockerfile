FROM amazoncorretto:8
WORKDIR /app
COPY target/AppKons-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java-B", "-jar", "app-A.jar"]
