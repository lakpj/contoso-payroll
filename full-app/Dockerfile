# Build the code
FROM openjdk AS build
COPY . /app/
WORKDIR /app/

RUN chmod +x ./mvnw
RUN ./mvnw clean verify

# Building the image
FROM openjdk:8-jre-alpine

#copy jar file from the build
COPY --from=build /app/target/contoso-payroll-*.jar /contoso/

EXPOSE 8080

CMD java -jar /contoso/contoso-payroll-*.jar