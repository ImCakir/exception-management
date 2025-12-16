# Exception Management with Spring Boot

This project demonstrates a clean and structured custom exception management architecture in a Spring Boot application.

## 🚀 Purpose
The main goal of this project is to show how to handle application-level errors in a centralized and maintainable way using:
- Custom exceptions
- Enum-based error messages
- Global exception handling

This structure helps create consistent and readable error responses for REST APIs.

## 🧩 Technologies Used
- Java
- Spring Boot
- Spring Web
- Lombok

## 🏗️ Exception Architecture

### 1. BaseException
A custom runtime exception class used as the base for all application-specific exceptions.

### 2. MessageType (Enum)
Defines error codes and user-friendly error messages.
Example:
- NO_RECORD_EXIST
- GENERAL_EXCEPTION

### 3. ErrorMessage
Combines `MessageType` with dynamic values (such as an ID) to generate meaningful error messages.

### 4. GlobalExceptionHandler
Uses `@ControllerAdvice` to handle exceptions globally and return a standardized error response structure.

## 📌 Example Scenario
When a requested employee record is not found:
- `BaseException` is thrown
- A meaningful error message is generated
- The client receives a clean and structured HTTP 400 response

## 📂 Project Structure

exception-management
├── controller
│    └── handler (GlobalExceptionHandler)
├── exception
│    ├── BaseException
│    ├── ErrorMessage
│    └── MessageType
└── service

## 🎯 Why This Project?
- Demonstrates backend best practices
- Shows clean error handling in REST APIs
- Suitable for real-world enterprise applications
- Good reference for Spring Boot interviews

## 👩‍💻 Author
Çağla Çakır
