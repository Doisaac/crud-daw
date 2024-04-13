# Usa la nueva imagen
FROM maven:3.9.6-eclipse-temurin-17-focal
# Crea carpeta /app para un mejor orden
WORKDIR /app
# Copia todo el proyecto al contenedor
COPY . .
# Maven limpia y compila el proyecto
RUN mvn clean package -DskipTests
# Ejecuta el archivo rar compilado
ENTRYPOINT [ "java", "-jar", "target/crud-0.0.1-SNAPSHOT.jar" ]