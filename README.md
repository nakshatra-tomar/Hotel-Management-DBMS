# Hotel Management Database System

This project is a hotel management database system implemented with Java Swing for the frontend and MySQL for the backend. It enhances operational efficiency by providing detailed management of customers, rooms, and employees, streamlining administrative processes.

## Features

- Detailed management of customers, rooms, and employees
- Real-time transaction processing
- Efficient data handling through well-structured SQL database schemas

## Setup Instructions

### Prerequisites

- Java Development Kit (JDK)
- MySQL Server
- MySQL Workbench or any other MySQL client

### Steps to Set Up a Local Server Instance

1. **Install MySQL Server**:
   - Download and install MySQL Server from the [official website](https://dev.mysql.com/downloads/mysql/).
   - Follow the installation instructions and configure the server as needed.

2. **Create the Database and Tables**:
   - Open MySQL Workbench or any other MySQL client.
   - Connect to your MySQL server.
   - Execute the following SQL commands to set up the database and tables:

   ```sql
   CREATE DATABASE hotelMS;

   USE hotelMS;
   SHOW DATABASES;

   CREATE TABLE login(username VARCHAR(25), password VARCHAR(25));
   SELECT * FROM login;

   INSERT INTO login VALUES('Nakshatra', 'qwerty123');

   CREATE TABLE room(
       roomnumber VARCHAR(20), 
       availability VARCHAR(20), 
       cleaning_status VARCHAR(40), 
       price VARCHAR(20), 
       bed_type VARCHAR(20)
   );
   SELECT * FROM room;

   CREATE TABLE employee(
       name VARCHAR(20), 
       age VARCHAR(20), 
       gender VARCHAR(20), 
       job VARCHAR(20), 
       salary VARCHAR(20), 
       phone VARCHAR(20), 
       email VARCHAR(20), 
       aadhar VARCHAR(20)
   );
   SELECT * FROM employee;

   CREATE TABLE driver(
       name VARCHAR(20), 
       age VARCHAR(20), 
       gender VARCHAR(20), 
       company VARCHAR(20), 
       carname VARCHAR(20), 
       available VARCHAR(20), 
       location VARCHAR(20)
   );
   SELECT * FROM driver;

   CREATE TABLE login2(user_name VARCHAR(20), password VARCHAR(20));
   SELECT * FROM login2;
   INSERT INTO login2 VALUES('Nakshatra', 'qwerty123');

   CREATE TABLE department(
       department VARCHAR(80), 
       budget VARCHAR(50)
   );
   SELECT * FROM department;

   INSERT INTO department VALUES('Office', '50000');
   INSERT INTO department VALUES('Food', '100000');
   INSERT INTO department VALUES('HouseKeeping', '60000');
   INSERT INTO department VALUES('Kitchen', '30000');

   SELECT * FROM department;

   CREATE TABLE customer(
       document VARCHAR(30), 
       number VARCHAR(30), 
       name VARCHAR(30), 
       gender VARCHAR(30), 
       country VARCHAR(30), 
       room VARCHAR(30), 
       checkintime VARCHAR(80), 
       deposit VARCHAR(30)
   );
   SELECT * FROM customer;


3. **Clone the Repository:**
   - Clone this repository to your local machine using git clone <repository-url>.
     
4. **Set Up the Java Application:**
   - Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
   - Make sure to configure the project to use the correct JDK.
   - Update the database connection settings in the Java code to match your local MySQL server configuration.

5. **Run the Application:**
   - Compile and run the Java application from your IDE.
   - The application should now be connected to your local MySQL server and ready to use.
   
## Usage
Use the application interfaces to manage customers, rooms, and employees.
Perform various administrative tasks through the provided functionalities.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
