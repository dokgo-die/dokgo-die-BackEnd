FROM eclipse-temurin:17.0.3_7-jre-focal
ADD build/libs/*.jar /app.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "/app.jar"]