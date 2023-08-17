# Primera etapa: Construcción con Maven
FROM maven:3.8.3-openjdk-17 AS build

# Copiar el código fuente a la imagen
COPY . /usr/src/app

# Establecer el directorio de trabajo para futuras operaciones
WORKDIR /usr/src/app

# Ejecutar Maven para compilar y empaquetar la aplicación
RUN mvn clean package

# Segunda etapa: Crear imagen final con el JRE
FROM openjdk:17-jdk-slim

# Exponer el puerto que la aplicación utiliza
EXPOSE 8080

# Copiar el JAR desde la primera etapa de construcción
COPY --from=build /usr/src/app/target/demo-1.0.jar /app.jar

# Establecer el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]