# Build the application
FROM openjdk AS build
COPY . /app/
WORKDIR /app/
RUN ./mvnw clean verify

# Building the image 
FROM openjdk:17-alpine

#copy jar file from builder
COPY --from=build /app/target/*.jar contoso-payroll-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","contoso-payroll-app.jar"]
