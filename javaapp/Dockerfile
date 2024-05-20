FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
COPY . .
RUN apk update && apk add mysql-client && mvn package -DskipTests

FROM eclipse-temurin:21-alpine
COPY --from=build target/javaapp.jar app.jar
EXPOSE 3003
CMD ["java", "-jar", "app.jar"]
