# Spring Boot Login and Signup Application

This is a simple Spring Boot application that handles user login and signup functionality. The application allows users to sign up with a username, email, and password. After successful signup, users can log in with their credentials and are redirected to a welcome page.

## Features
- User can sign up with a username and email.
- User can log in with their credentials.
- On successful login, the user is redirected to a welcome page with a personalized message.
  
## Technologies Used
- **Spring Boot**: Framework for building the application.
- **Thymeleaf**: Template engine for rendering HTML views.
- **Spring Data JPA**: Used to interact with the database.
- **MySQL**: Database for storing user credentials.
- **Bootstrap**: For styling the front-end forms.

## Dependencies (used via Spring Initializr)
The following dependencies were selected via [Spring Initializr](https://start.spring.io/):

1. **Spring Web**: To create the REST API and serve web pages.
2. **Spring Data JPA**: For interacting with the database using JPA repositories.
3. **Thymeleaf**: To render dynamic web pages using templates.
4. **MySQL Driver**: For connecting to the MySQL database.

## Setting Up the Application

1. **Clone the repository**:
    ```bash
    git clone https://github.com/ruturajjadhav07/simple-login-signup-form-springboot.git
    cd login-signup-springboot
    ```

2. **Database Setup**:
    - Create a database in MySQL (e.g., `user_db`).
    - Set up the following tables:
        - `userLogin`: Stores login details (`username`, `password`).
        - `userSignup`: Stores signup details (`username`, `password`, `email`).

3. **Configure `application.properties`**:
   Add your MySQL credentials in the `src/main/resources/application.properties` file:
```properties
   
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/DatabaseName
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update


```
4. **Run the Application:** You can run the application by executing the following command:

```bash
./mvnw spring-boot:run
```
5. Access the Application:
```
Navigate to http://localhost:8080/login to access the login page.
Navigate to http://localhost:8080/signup to access the signup page.
```


**Sample SQL for Database**
Here is the sample SQL to create the necessary tables in MySQL:
```bash
sql
Copy code
CREATE DATABASE user_db;

USE user_db;

CREATE TABLE userLogin (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    user_password VARCHAR(255) NOT NULL
);

CREATE TABLE userSignup (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    user_password VARCHAR(255) NOT NULL,
    user_email VARCHAR(255) NOT NULL
);
```

**Screenshots**
Signup Page:
![image](https://github.com/user-attachments/assets/bf74284c-6db3-450b-98b1-e71d02b85ce6)

Login Page:
![image](https://github.com/user-attachments/assets/78417431-1b89-43f0-9179-359cb5df04ef)

Welcome Page:
![image](https://github.com/user-attachments/assets/006cb0ff-a1b4-465d-98bd-c7d12d3bcf22)
