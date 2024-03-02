FROM maven:latest
WORKDIR /App
COPY pom.xml /App
COPY src /App/
RUN mvn package
CMD ["java", "-jar", "target/temperature-convertor.jar"]