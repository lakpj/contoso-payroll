# Build the application
# FROM openjdk AS build
# COPY . /app/
# WORKDIR /app/
# RUN chmod +x ./mvnw
# RUN ./mvnw clean verify

# # Building the image 
# FROM openjdk:17-alpine

# #copy jar file from builder
# COPY --from=build /app/target/*.jar contoso-payroll-app.jar
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","contoso-payroll-app.jar"]

# Build the application
FROM maven:3.6.1-jdk-8-slim AS build
RUN mkdir -p workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
ENV PATH /workspace/node_modules/.bin:$PATH
COPY package.json ./workspace
COPY package-lock.json /workspace/

RUN mvn -f pom.xml clean install -DskipTests=true
FROM openjdk:17-alpine
COPY --from=build /workspace/target/*.jar contoso-payroll-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","contoso-payroll-app.jar"]