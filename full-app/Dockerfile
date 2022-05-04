# # Build the code
# FROM openjdk AS build
# COPY . /app/
# WORKDIR /app/

# RUN chmod +x ./mvnw
# RUN ./mvnw clean verify

# Building the image
FROM openjdk:8-jre-alpine

WORKDIR /
#copy jar file from the build
#COPY --from=build /app/target/contoso-payroll-*.jar /contoso/

COPY /target/contoso-payroll-1.0.jar ./

EXPOSE 8080

CMD java -jar contoso-payroll-1.0.jar --spring.config.location=classpath:/docker-application.properties