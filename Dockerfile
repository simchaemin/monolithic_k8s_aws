#jdk image pull
FROM eclipse-temurin:17-jdk-alpine

#jar
ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} ./backend.jar

ENTRYPOINT ["java", "-jar", "./backend.jar"]