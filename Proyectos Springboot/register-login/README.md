# SPRING SECURITY CON CORREO Y CONTRASEÑA
Este proyecto es un ejemplo básico de cómo implementar autenticación y autorización en una aplicación Spring Boot. Incluye las siguientes características:
- Registro de usuarios
- Inicio de sesión
- Autorización basada en roles
- Protección de rutas según el rol del usuario










## Requisitos Previos

- JDK 17 o superior
- Maven 3.x
- Un IDE compatible con Java (IntelliJ IDEA, Eclipse,netBeans, VSC)





## Configuración del Proyecto

El proyecto se creó utilizando [Spring Initializr](https://start.spring.io/) con las siguientes dependencias:
- **Spring Web**: Para manejar las solicitudes HTTP.
- **Spring Security**: Para proporcionar autenticación y autorización.
- **Spring Data JPA**: Para interactuar con la base de datos.
- **MYSQL** (o MySQL): Base de datos  para desarrollo rápido.
- **JWT**: autentificacion basada en tokens




## Dependencias

Debemos buscar dependencias en `https://mvnrepository.com/` , muy buena practica.


### pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.3.4</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.springsecurity.register-login</groupId>
	<artifactId>register-login</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>register-login</name>
	<description>Demo project for Spring Boot</description>
	<url />
	<licenses>
		<license />
	</licenses>
	<developers>
		<developer />
	</developers>
	<scm>
		<connection />
		<developerConnection />
		<tag />
		<url />
	</scm>
	<properties>
		<java.version>17</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>


		<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.12.6</version>
		</dependency>


		<!--
		https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
			<version>3.3.3</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>

	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>


```




## Autenticacion Baisca con UserDetailService

1. Autenticación Básica con UserDetailsService
¿Qué es?
La autenticación básica en Spring Security utiliza el UserDetailsService para cargar los detalles del usuario desde la base de datos y el PasswordEncoder para verificar las contraseñas. El código que mencionas:

```java
return new org.springframework.security.core.userdetails.User(
        user.getEmail(),
        user.getPassword(),
        Collections.singleton(new SimpleGrantedAuthority(user.getRole().name()))
);

```
Este fragmento crea un objeto User de Spring Security que es una implementación de UserDetails. Esta implementación se usa para manejar la autenticación y autorización basada en roles en la configuración de seguridad.

#### ¿Cómo funciona?
- Cargar el Usuario: UserDetailsService implementa el método loadUserByUsername para recuperar 
  la información del usuario desde la base de datos.
- Verificación de Contraseña: Spring Security usa PasswordEncoder para comparar la contraseña  
  proporcionada por el usuario con la almacenada en la base de datos.
- Autorización: Los roles del usuario (definidos por SimpleGrantedAuthority) determinan a qué 
  recursos puede acceder.

#### Ventajas:
Simplicidad: Ideal para aplicaciones que no necesitan un manejo complejo de tokens y son adecuadas para la mayoría de las aplicaciones con sesión en servidor.
Configuración Básica: Requiere menos configuración y es más directa para empezar.
#### Desventajas:
Sesiones: Usa sesiones para mantener el estado del usuario, lo que puede no ser adecuado para aplicaciones altamente escalables o distribuidas.




# DOCUMENTACION
- `https://spring.io/projects/spring-security` 
    
	`https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/index.html#servlet-authentication-unpwd`
   
- `https://www.bezkoder.com/spring-boot-jwt-mysql-spring-security-architecture/`
- `https://www.youtube.com/watch?v=KBvBY5qyfEM&t=2723s`