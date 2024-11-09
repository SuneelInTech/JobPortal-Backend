# Job Portal Backend
================
## Overview

The Job Portal Backend is a robust Spring Boot application designed to manage job postings efficiently. It provides a comprehensive set of RESTful APIs for creating, retrieving, updating, and deleting job postings. The application utilizes PostgreSQL as its relational database for data persistence, ensuring reliable and scalable data management.

## Technologies Used

- **Spring Boot:** A powerful framework for building web applications quickly and efficiently.
- **Spring Data JPA:** Simplifies data access and manipulation using JPA and Hibernate.
- **PostgreSQL:** A robust relational database management system for storing application data.
- **Lombok (Optional):** Reduces boilerplate code, making the codebase cleaner and more maintainable.

## Features

- **Job Postings Management:**
    - Create, retrieve, update, and delete job postings.
    - Search job postings based on keywords in the job title or description.
    - Load sample job postings for development purposes.

## API Documentation

The application exposes the following RESTful APIs, accessible at `http://localhost:8081` (port may vary based on your configuration):

### GET APIs

- **`GET /jobPosts`**: Retrieves a list of all job postings.
- **`GET /jobPost/{postId}`**: Retrieves a specific job posting by its ID.
- **`GET /jobPosts/keyword/{keyword}`**: Searches job postings based on a provided keyword in the job title or description.
- **`GET /load`**: Loads sample job postings into the database (not recommended for production environments).

### POST API

- **`POST /jobPost`**: Creates a new job posting. Requires a JSON body representing the job posting.

### PUT API

- **`PUT /jobPost`**: Updates an existing job posting. Requires a JSON body representing the updated job posting.

### DELETE API

- **`DELETE /jobPost/{postId}`**: Deletes a job posting by its ID.

## Database Configuration

The application connects to a PostgreSQL database using the following configuration:

- **JDBC URL:** `jdbc:postgresql://localhost:5432/telusko`
- **Username:** `postgres`
- **Password:** `Ksuneel143@` (replace with your actual credentials)

You can configure these details in the `application.properties` file.

## Getting Started

1. Clone the repository to your local machine.
2. Open the File in  `Intellij Ide` and Just reload , it will automatically install required dependencies.
3. Connect the database with your credentials.
4. Run the application using `Tomcat Server`.
5. Set the port `8081` in `application.properties` if `localhost:8080` is failed to work.

