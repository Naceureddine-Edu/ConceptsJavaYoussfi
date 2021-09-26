FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/myapp-jar-with-dependencies.jar

# cd /usr/local/runme
WORKDIR /usr/local/runme

# copy target/myapp-jar-with-dependencies.jar /usr/local/runme/app.jar
COPY ${JAR_FILE} app.jar

# port
EXPOSE 4567

# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","app.jar"]