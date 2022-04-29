#FROM maven:3.6.3-jdk-11 AS build
#WORKDIR /backend
#COPY mvnw .
#COPY .mvn .mvn
#COPY pom.xml .
#COPY src src
#RUN mvn -f pom.xml clean install -DskipTests=true

FROM openjdk:17-alpine
COPY --from=build /backend/target/*.jar contoso-payroll-backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","contoso-payroll-backend.jar"]