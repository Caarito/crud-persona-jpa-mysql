# CRUD de Persona con Java, JPA, MySQL y MVC

Este proyecto implementa un CRUD (Create, Read, Update, Delete) para una entidad de Persona utilizando Java, JPA (Java Persistence API), MySQL y el patrón de diseño MVC (Modelo-Vista-Controlador).

## Descripción

El CRUD proporciona operaciones básicas para gestionar información sobre personas, permitiendo:

- **Crear**: Agregar una nueva persona a la base de datos.
- **Leer**: Consultar y visualizar información detallada sobre una persona específica.
- **Actualizar**: Modificar los datos de una persona existente.
- **Eliminar**: Eliminar un registro de persona de la base de datos.

## Requisitos previos

Para ejecutar este proyecto en tu entorno local, necesitarás tener instalados:

- Java Development Kit (JDK)
- Maven
- MySQL Server
- IDE (Integrated Development Environment) compatible con Java y Maven, como IntelliJ IDEA o Eclipse.

## Configuración

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE.
3. Asegúrate de tener una instancia de MySQL en ejecución localmente o configura los detalles de conexión en el archivo `application.properties` dentro de `src/main/resources`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_de_datos
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
