# Instrucciones para ejecutar el CRUD con Docker Compose

Sigue estos pasos para ejecutar el CRUD utilizando Docker Compose:

1. **Borrar Imágenes y Contenedores Anteriores:**
   - Abre tu terminal.
   - Ejecuta el siguiente comando para limpiar la caché eliminando cualquier imagen y contenedor relacionado con el CRUD:
     ```bash
     docker-compose down --rmi all -v
     ```

2. **Iniciar Docker Compose:**
   - En tu terminal, ejecuta el siguiente comando para iniciar Docker Compose en segundo plano:
     ```bash
     docker-compose up -d
     ```

3. **Verificar Estado de los Contenedores:**
   - Ejecuta el siguiente comando para verificar que ambos contenedores estén en ejecución y funcionando correctamente:
     ```bash
     docker-compose ps
     ```
   - Verifica que ambos contenedores estén en verde y en estado "Up".

4. **Acceder a la Aplicación:**
   - Abre tu navegador web.
   - Visita la siguiente URL para acceder a la aplicación CRUD:
     [http://localhost:8080/users](http://localhost:8080/users)

¡Listo! Ahora deberías poder acceder a la aplicación CRUD desde tu navegador web.

