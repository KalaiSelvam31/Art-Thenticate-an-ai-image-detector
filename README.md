# 🎨 Art-thenticate

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

> AI Image Detection Service - Authenticate Original Digital Art

A robust backend service built with Spring Boot designed to detect AI-generated images and authenticate original digital art. This project provides a secure foundation for user management and will be extended to include advanced AI analysis features.

## 📋 Table of Contents

- [About](#about)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)

## 🎯 About

In an era where AI-generated content is becoming increasingly sophisticated, distinguishing between human-created art and synthetic images is a growing challenge. **Art-thenticate** aims to provide a reliable service for artists, content creators, and platforms to verify the origin of digital images.

This repository contains the backend REST API that handles user registration, authentication, and will serve as the engine for the image analysis functionality.

## ✨ Features

### 🔐 User Authentication & Security

- **User Registration**
  - Secure endpoint for new user account creation
  - Duplicate email validation
  - Password hashing with BCryptPasswordEncoder
  
- **User Login**
  - Credential validation and authentication
  - Secure password comparison with stored hashes
  
- **Security Configuration**
  - Powered by Spring Security
  - Public access limited to registration and login endpoints
  - Stateless architecture ready for JWT integration
  - Protected endpoints require authentication

### 🏗️ Core Backend Architecture

- **RESTful API**: Built with Spring Web controllers
- **Service Layer**: Clean separation of business logic
  - `RegisterService`
  - `LoginService`
- **Data Persistence**: Spring Data JPA integration
  - `Users` entity for user data modeling
  - `Registry` repository for database operations
- **DTOs**: Secure data transfer with validation
  - `RegisterDTO`
  - `LoginDTO`

## 🛠️ Technology Stack

- **Backend**: Java, Spring Boot
- **Security**: Spring Security
- **Database**: Spring Data JPA / Hibernate

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Your preferred IDE (IntelliJ IDEA, Eclipse, VS Code)
- Database (PostgreSQL/MySQL/H2)

### Installation

1. Clone the repository
```bash
git clone https://github.com/yourusername/art-thenticate.git
cd art-thenticate
```

2. Configure your database
```properties
# application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/artthenticate
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```

The server will start on `http://localhost:8080`

## 📡 API Endpoints

| Method | Endpoint | Description | Access |
|--------|----------|-------------|--------|
| POST | `/register` | Register a new user | Public |
| POST | `/Login` | Authenticate a user | Public |
| GET | `/hellov` | Get all users (Dev) | Private |



## 🗺️ Roadmap

### Phase 1: Core AI Detection Functionality
- [ ] Image upload endpoint for authenticated users
- [ ] AI model integration (CNN/Vision Transformer)
- [ ] Analysis results API with probability scores
- [ ] `ImageAnalysis` entity for storing analysis metadata

### Phase 2: Usage & Credit System
- [ ] Implement credit logic (currently initialized to 5 per user)
- [ ] Credit decrement on image analysis
- [ ] Usage limits and validation
- [ ] Credit purchase/renewal system

### Phase 3: Enhanced API Security
- [ ] JWT implementation for authentication
- [ ] Token-based request authorization
- [ ] Refresh token mechanism
- [ ] Role-based access control (RBAC)

### Phase 4: Advanced Features
- [ ] Batch image processing
- [ ] Analysis history and reporting
- [ ] API rate limiting
- [ ] Webhook notifications
- [ ] Admin dashboard

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

## 🙏 Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Security](https://spring.io/projects/spring-security)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Lombok](https://projectlombok.org/)

---

<p align="center">Made with ❤️ for the digital art community</p>
