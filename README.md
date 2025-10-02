# Art-thenticate: AI Image Detection Service

A backend service built with Spring Boot to detect AI-generated images and authenticate original digital art. This project provides a secure, robust foundation for user management and will be extended to include the core AI analysis features.

## About The Project

In an era where AI-generated content is becoming increasingly sophisticated, distinguishing between human-created art and synthetic images is a growing challenge. Art-thenticate aims to provide a reliable service for artists, content creators, and platforms to verify the origin of digital images.

This repository contains the backend REST API that handles user registration, authentication, and will serve as the engine for the image analysis functionality.

## Current Progress (Features Developed)

The foundational backend for user management is complete. This includes:

#### User Authentication & Security
* [cite_start]**User Registration:** A secure endpoint (`/register`) allows new users to create an account[cite: 423, 426].
    * [cite_start]The system checks if a user already exists with the given email to prevent duplicates[cite: 264, 265].
    * [cite_start]Passwords are securely hashed using `BCryptPasswordEncoder` before being stored[cite: 255, 281].
* [cite_start]**User Login:** An endpoint (`/Login`) for authenticating users[cite: 383, 386].
    * [cite_start]The service validates credentials by comparing the provided password with the stored hash[cite: 217].
* [cite_start]**Security Configuration:** The application is secured using Spring Security[cite: 501].
    * [cite_start]Public access is granted only to the registration and login endpoints[cite: 516, 517].
    * [cite_start]All other endpoints require authentication[cite: 523].
    * [cite_start]The security configuration is stateless, preparing the application for token-based authentication (e.g., JWT)[cite: 525, 526].

#### Core Backend Structure
* [cite_start]**RESTful API:** The application is built as a REST API using Spring Web controllers[cite: 348, 382, 422].
* [cite_start]**Service Layer:** Business logic is properly separated into service classes (`RegisterService` [cite: 245][cite_start], `LoginService` [cite: 195]).
* [cite_start]**Data Persistence:** User data is stored in a database managed by Spring Data JPA[cite: 457, 458].
    * [cite_start]A `Users` entity models the user data in the database[cite: 96].
    * [cite_start]A `Registry` repository interface handles all database operations[cite: 464].
* [cite_start]**Data Transfer Objects (DTOs):** `RegisterDTO` [cite: 51] [cite_start]and `LoginDTO` [cite: 31] are used to safely transfer data between the client and the server.

## Future Development (Roadmap)

The next phase of development will focus on implementing the core AI detection functionality and enhancing the API.

#### 1. Core AI Detection Functionality
* **Image Upload Endpoint:** Create a secure endpoint for authenticated users to upload images for analysis.
* **AI Model Integration:** Integrate a machine learning or deep learning model (e.g., a CNN or Vision Transformer) to process the images. This service will determine the probability of an image being AI-generated.
* **Analysis Results API:** Develop endpoints for users to retrieve the analysis results for their submitted images, including a probability score and a binary classification (AI/Original).
* **Image Analysis Model:** Create a new JPA entity (`ImageAnalysis`) to store uploaded image metadata and the corresponding AI detection results, linked to the user who submitted it.

#### 2. Usage & Credit System
* [cite_start]**Implement Credit Logic:** The `Users` entity currently has a field named `able` initialized to 5[cite: 114, 271]. This will be developed into a credit system.
* **Decrement on Use:** For each image analysis, a user's `able` count will be decremented.
* **Usage Limits:** Users will be blocked from submitting new images for analysis if their credit count reaches zero.

#### 3. Enhanced API Security
* **JWT Implementation:** Replace the current session-based authentication with JSON Web Tokens (JWT). Upon successful login, the API will return a JWT, which must be included in the headers of all subsequent authenticated requests. This will complete the stateless architecture.

## Technology Stack

* **Java**
* **Spring Boot**
* **Spring Security**
* **Spring Data JPA**
* **Lombok**
* **Maven**
