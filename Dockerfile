FROM amazoncorretto:17.0.8-alpine3.18
WORKDIR /app
COPY target/UserCommentsService-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]