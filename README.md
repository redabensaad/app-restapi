![Java](https://img.shields.io/badge/Java-25-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.5-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.x-blue)
![Jackson](https://img.shields.io/badge/Jackson-JSON_Processing-black)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-336791)

# RestAPI • Secure REST API (Spring Boot + PostgreSQL + JWT)

RESTful API built with Spring Boot featuring JWT authentication, user management, role-based security, PostgreSQL persistence, and input validation.

## ✨ Key Features

* **JWT Authentication:** Secure, stateless authentication using JSON Web Tokens.
* **User Management:** Complete CRUD operations for user resources.
* **Role-Based Security:** Protected endpoints using Spring Security.
* **Input Validation:** Request validation powered by Jakarta Bean Validation.
* **Password Encryption:** BCrypt hashing for secure password storage.
* **Global Exception Handling:** Consistent API error responses and status codes.
* **PostgreSQL Integration:** Data persistence with Spring Data JPA and Hibernate.

## 🛠️ Technologies Used

* **Java 25**
* **Spring Boot**
* **Spring Security**
* **JWT (jjwt)**
* **Spring Data JPA**
* **Hibernate**
* **PostgreSQL**
* **Maven**
* **Lombok**

## 🚀 Getting Started

### Prerequisites

* **JDK 25+**
* **Maven 3.9+**
* **PostgreSQL 16+**

### Clone Repository

```bash
git clone git@github.com:redabensaad/restapi.git
cd restapi
```

### Create Database

```sql
CREATE DATABASE restapi_db;
```

### Configure Application

Create the `src/main/resources/application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/restapi_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

jwt.secret=your_secret_key_at_least_32_characters
jwt.expiration=86400000
```

### Run Application

```bash
mvn spring-boot:run
```

API available at:

```text
http://localhost:8080
```

## 🔐 Authentication Endpoints

Base URL:

```text
/api/auth
```

| Method | Endpoint | Description |
|----------|----------|-------------|
| POST | `/register` | Register a new user |
| POST | `/login` | Authenticate and receive a JWT token |

### Register Request

```json
{
"name": "John Doe",
"email": "john@example.com",
"password": "secret123"
}
```

### Login Request

```json
{
"email": "john@example.com",
"password": "secret123"
}
```

### Login Response

```json
{
"token": "eyJ...",
"email": "john@example.com"
}
```

## 👤 User Endpoints

All endpoints require authentication:

```http
Authorization: Bearer <token>
```

Base URL:

```text
/api/users
```

| Method | Endpoint | Description |
|----------|----------|-------------|
| GET | `/` | Retrieve all users |
| GET | `/{id}` | Retrieve user by ID |
| POST | `/` | Create a user |
| PUT | `/{id}` | Partially update a user |
| DELETE | `/{id}` | Delete a user |

### Update Request

All fields are optional:

```json
{
"name": "Updated Name",
"email": "updated@example.com",
"password": "newpassword"
}
```

## 📌 API Capabilities

* **Create, Read, Update, and Delete Users**
* **JWT-Based Authentication**
* **Stateless Session Management**
* **BCrypt Password Hashing**
* **Request Validation**
* **Global Exception Handling**
* **Custom Error Responses**
* **Protected REST Endpoints**

## 📦 Project Status

**Completed • Learning & Portfolio Project**

This project demonstrates modern Spring Boot backend development practices, including authentication, security, persistence, validation, and REST API design.

