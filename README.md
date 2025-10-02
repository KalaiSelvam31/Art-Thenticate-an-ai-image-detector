🎨 Art-thenticate: AI Image Detection Service
A backend service built with Spring Boot to detect AI-generated images and authenticate original digital art. This project provides a secure, robust foundation for user management and will be extended to include the core AI analysis features.

📖 About The Project
In an era where AI-generated content is becoming increasingly sophisticated, distinguishing between human-created art and synthetic images is a growing challenge. Art-thenticate aims to provide a reliable service for artists, content creators, and platforms to verify the origin of digital images.

This repository contains the backend REST API that handles user registration, authentication, and will serve as the engine for the image analysis functionality.

✅ Current Progress (Features Developed)
The foundational backend for user management is complete. This includes:

🔐 User Authentication & Security
User Registration: A secure endpoint (/register) allows new users to create an account.

The system checks if a user already exists with the given email to prevent duplicates.

Passwords are securely hashed using BCryptPasswordEncoder before being stored.

User Login: An endpoint (/Login) for authenticating users.

The service validates credentials by comparing the provided password with the stored hash.

Security Configuration: The application is secured using Spring Security.

Public access is granted only to the registration and login endpoints.

All other endpoints require authentication.

The security configuration is stateless, preparing the application for token-based authentication (e.g., JWT).

🏗️ Core Backend Structure
RESTful API: The application is built as a REST API using Spring Web controllers.

Service Layer: Business logic is properly separated into service classes (RegisterService, LoginService).

Data Persistence: User data is stored in a database managed by Spring Data JPA.

A Users entity models the user data in the database.

A Registry repository interface handles all database operations.

Data Transfer Objects (DTOs): RegisterDTO and LoginDTO are used to safely transfer data between the client and the server, with built-in validation.

🚀 Future Development (Roadmap)
The next phase of development will focus on implementing the core AI detection functionality and enhancing the API.

1. Core AI Detection Functionality
Image Upload Endpoint: Create a secure endpoint for authenticated users to upload images for analysis.

AI Model Integration: Integrate a machine learning or deep learning model (e.g., a CNN or Vision Transformer) to process the images. This service will determine the probability of an image being AI-generated.

Analysis Results API: Develop endpoints for users to retrieve the analysis results for their submitted images, including a probability score and a binary classification (AI/Original).

Image Analysis Model: Create a new JPA entity (ImageAnalysis) to store uploaded image metadata and the corresponding AI detection results, linked to the user who submitted it.

2. Usage & Credit System
Implement Credit Logic: The Users entity currently has a field named able initialized to 5. This will be developed into a credit system.

Decrement on Use: For each image analysis, a user's able credit count will be decremented.

Usage Limits: Users will be blocked from submitting new images for analysis if their credit count reaches zero.

3. Enhanced API Security
JWT Implementation: Replace the current basic authentication with JSON Web Tokens (JWT). Upon successful login, the API will return a JWT, which must be included in the headers of all subsequent authenticated requests. This will complete the stateless architecture.

🛠️ Technology Stack
Backend: Java, Spring Boot

Security: Spring Security

Database: Spring Data JPA / Hibernate

Utilities: Lombok

Build Tool: Maven

Endpoints
Method

Endpoint

Description

Access

POST

/register

Registers a new user.

Public

POST

/Login

Authenticates a user.

Public

GET

/hellov

(Dev) Gets all users.

Private

