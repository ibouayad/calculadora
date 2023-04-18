# Calculadora
Microservicio de una calculadora realizado con Spring Boot, Swagger 2 y Spring Fox.

La calculadora traza todos los resultados usando la librería tracer-1.0.0.jar.

#### Tecnologías

Apache Maven 2.2.0.RELEASE

Java openjdk 11

#### Librerías necesarias
<!-- libreria de tracer -->
		<dependency>
			<groupId>io.corp.calculator</groupId>
			<artifactId>tracer</artifactId>
			<version>1.0</version>
			<scope>system</scope>
			<systemPath>${basedir}/lib/tracer-1.0.0.jar</systemPath>
		</dependency>
---

#### Cómo compilar el microservicio en local

Para construir el proyecto se utilizarán los siguientes comandos:

> mvn clean install

Este comando ejecuta:
1. Limpiar el target del proyecto.
2. Recogerá las librerías necesarias para el microservicio.
3. Compilará el proyecto con las propiedades de la carpeta `src/main/resources/application.properties`

---

#### Cómo ejecutar el microservicio en local
Siguiendo los pasos anteriores, bastaría con ejecutar el comando en la carpeta raíz del proyecto:

> mvn spring-boot:run

---

#### Servicios disponibles
Una vez lanzado el microservicio se podrá acceder al API accediendo a la siguiente URL:
> **local**: http://localhost:8081/swagger-ui.html

---

