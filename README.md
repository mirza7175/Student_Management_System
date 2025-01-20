# Student Management App

A simpel Java-based **Student Management System** that uses **JDBC** to interact with a MySQL database. This application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on a student database.

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
```

### 2. Project Configuration

1. Download the MySQL JDBC driver and add it to your project’s classpath.
2. Update the database connection details in the `CP` class (`CP.java`):
   ```java
   String user = "your_mysql_username";
   String password = "your_mysql_password";
   String url = "jdbc:mysql://localhost:3306/student_manage";
   ```

---

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/mirza7175/Student_Management_System.git
   cd Student_Management_System
   ```

2. Compile the project:
   ```bash
   javac -cp .:mysql-connector-java-<version>.jar Main.java
   ```

3. Run the application:
   ```bash
   java -cp .:mysql-connector-java-<version>.jar Main
   ```

---

## File Structure

- **Main.java**: The entry point of the application with a menu-driven interface.
- **Student.java**: The model class representing the student entity.
- **StudentDao.java**: Contains methods to perform CRUD operations.
- **CP.java**: Provides a connection to the database.

---

## Example Usage

1. **Add a Student**:
   ```
   PRESS 1 to ADD student
   Enter name: John Doe
   Enter phn: 1234567890
   Enter city: New York
   ```

2. **Display Students**:
   ```
   PRESS 3 to display students
   ID: 1
   Name: John Doe
   Phone: 1234567890
   City: New York
   ************************************
   ```

3. **Update a Student**:
   ```
   PRESS 4 to Update student
   Enter student ID to update: 1
   Enter new name: Jane Doe
   Enter new phone: 9876543210
   Enter new city: Los Angeles
   ```

4. **Delete a Student**:
   ```
   PRESS 2 to Delete student
   Enter student id to delete: 1
   ```

---

## Known Issues

- Error handling can be improved for invalid inputs.
- No support for advanced search or filtering features.

---

## Future Enhancements

- Add a graphical user interface (GUI).
- Integrate more complex queries and features (e.g., pagination, sorting).
- Enhance input validation and exception handling.

---
