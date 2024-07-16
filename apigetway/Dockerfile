FROM openjdk:11-jre-slim
EXPOSE 8089
ADD /target/apigateway-0.0.1-SNAPSHOT.jar apigateway.jar
ENTRYPOINT ["java" , "-jar" , "apigateway.jar"]