Dealer Vehicle API
This project is a Spring Boot REST API for managing car dealers and their vehicles.
It was developed as part of a technical interview process to demonstrate backend design, RESTful API development, and use of modern Java frameworks.

Project Overview
The API allows you to:

Create, read, update, and delete (CRUD) dealers and vehicles
Assign vehicles to dealers
Support dealer subscription types (BASIC, PREMIUM)
Filter vehicles by dealer subscription type (e.g., get all vehicles for PREMIUM dealers)
Test and explore the API using Swagger UI
How It Works
Entities:

Dealer: Represents a car dealer with a name, email, and subscription type.
Vehicle: Represents a vehicle with a model, price, status (AVAILABLE/SOLD), and a reference to its dealer.
Repositories:

Use Spring Data JPA to interact with a PostgreSQL database.
Services:

Business logic for managing dealers and vehicles.
Controllers:

REST endpoints for CRUD operations and custom queries.
Swagger UI:

Auto-generated API documentation and testing interface at /swagger-ui.html.
Tech Stack
Java 17
Spring Boot
Spring Data JPA
PostgreSQL
Swagger/OpenAPI
Getting Started
Prerequisites
Java 17+
Maven
PostgreSQL
Setup
Clone the repository:

git clone https://github.com/akshatshashi/dealer-management-api.git
cd dealer-management-api
Configure your database in src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/dealervehicle_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
Build and run the application:

mvn spring-boot:run
Access Swagger UI for API testing:

http://localhost:8080/swagger-ui.html
(or http://localhost:8081/swagger-ui.html if you changed the port)

API Endpoints
POST /api/dealers — Create a new dealer

GET /api/dealers — List all dealers

GET /api/dealers/{id} — Get dealer by ID

DELETE /api/dealers/{id} — Delete dealer

POST /api/vehicles — Create a new vehicle

GET /api/vehicles — List all vehicles

GET /api/vehicles/{id} — Get vehicle by ID

DELETE /api/vehicles/{id} — Delete vehicle

GET /api/vehicles/premium-dealers — List vehicles for PREMIUM dealers only

Why This Project?
This project demonstrates:

Clean RESTful API design
Use of Java, Spring Boot, and JPA best practices
Entity relationships and filtering logic
API documentation and testing with Swagger UI
