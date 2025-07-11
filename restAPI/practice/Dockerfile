# Build
FROM gradle:8.5.0-jdk17 AS builder
WORKDIR /build
COPY . .
RUN ./gradlew build -x test --no-daemon

# Run
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /build/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
