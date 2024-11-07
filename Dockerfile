FROM maven:3.9.5-eclipse-temurin-17-alpine

RUN mkdir -p /app
RUN mkdir -p /app/temp

WORKDIR /app
COPY target/EmployeeManagementSystem*.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-Dworking.dir=/app", "-jar", "/app/app.jar"]