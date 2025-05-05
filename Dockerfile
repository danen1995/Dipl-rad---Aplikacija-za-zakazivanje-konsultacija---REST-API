FROM amazoncorretto:8
WORKDIR /app
COPY target/AppKons-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]