# Student Management App

A simple Java-based **Student Management System** that uses **JDBC** to interact with a MySQL database. This application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on a student database.

---

## Features

- **Add Students**: Add new students to the database.
- **Delete Students**: Remove students from the database using their unique ID.
- **Display Students**: View all students in the database.
- **Update Students**: Update the details of an existing student.

---

## Technologies Used

- **Java**: Core programming language for the application.
- **JDBC**: To connect and execute SQL queries with MySQL.
- **MySQL**: Database to store student details.
- **BufferedReader**: For input handling.

---

## Prerequisites

Before running the project, ensure you have the following installed:

1. **Java Development Kit (JDK)** (version 8 or higher)
2. **MySQL Server** (with a running instance)
3. **JDBC Driver** for MySQL (e.g., `mysql-connector-java-<version>.jar`)

---

## Setup and Configuration

### 1. Database Setup

Run the following SQL commands to create the required database and table:

```sql
CREATE DATABASE student_manage;

USE student_manage;

CREATE TABLE students (
    sid INT AUTO_INCREMENT PRIMARY KEY,
    sname VARCHAR(50),
    sphon VARCHAR(15),
    scity VARCHAR(50)
);
