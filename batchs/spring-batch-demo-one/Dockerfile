FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-batch-demo-one.jar
ENTRYPOINT ["java","-jar","/spring-batch-demo-one.jar"]