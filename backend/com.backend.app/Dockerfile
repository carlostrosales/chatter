# Stage 1: Build
FROM quay.io/quarkus/quarkus-maven:3.2.9.Final-java17 AS build
WORKDIR /app
COPY . .
RUN ./mvnw package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/target/quarkus-app/ .
CMD ["java", "-jar", "quarkus-run.jar"]

