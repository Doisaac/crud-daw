# Instrucciones para ejecutar el CRUD con Docker Compose

##### Douglas Isaac Barrera Magaña - BM22025
##### Ricardo Enrique Heredia Ramos - HR21024
##### Alejandro Daniel Avalos Santamaria - AS19014
-------------------------------------------------------------------

Sigue estos pasos para ejecutar el CRUD utilizando Docker Compose:

1. **Borrar Imágenes y Contenedores Anteriores:**
   - Abre Docker Desktop.
   - Ejecuta el siguiente comando para limpiar la caché eliminando cualquier imagen y contenedor relacionado con el CRUD:
     
     ```bash
     docker-compose down --rmi all -v
     ```
    (Cabe aclarar que si hay imágenes importantes existentes también se veran afectadas, para evitar inconvenientes también puedes usar Docker Desktop y borrar directamente la imagen)

2. **Iniciar La Aplicación con Docker:**
   - En tu terminal, ejecuta el siguiente comando para iniciar Docker Compose en segundo plano:
     
     ```bash
     docker-compose up -d
     ``` 

3. **Iniciar La Aplicación Localmente:**
   - Desde Docker Desktop inicia el contenedor "java_db"
   - Utilizando el Spring Boot Dashboard, selecciona la aplicación y corre el proyecto

3. **Verificar Estado de los Contenedores:**
   - Ejecuta el siguiente comando para verificar que ambos contenedores estén en ejecución y funcionando correctamente:
     
     ```bash
     docker-compose ps
     ```
   - Verifica que ambos contenedores estén en verde y en estado "Up" en Docker Desktop.

4. **Acceder a la Aplicación:**
   - Abre tu navegador web.
   - Visita la siguiente URL para acceder a la aplicación CRUD:
     [http://localhost:8080/users](http://localhost:8080/users)

¡Listo! Ahora deberías poder acceder a la aplicación CRUD desde tu navegador web.

