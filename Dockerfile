FROM openjdk:17.0.2

WORKDIR /app

COPY ./target/rick-and-morty-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "rick-and-morty-0.0.1-SNAPSHOT.jar"]