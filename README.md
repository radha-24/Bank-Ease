# Bank Management System

## Overview
The Bank Management System is a Java-based application designed to handle basic banking operations. The system allows users to perform actions such as balance inquiry, deposit, withdrawal, and viewing transaction history. It utilizes a MySQL database for storing user and transaction data.

## Features
- **User Authentication:** Secure login and signup processes.
- **Balance Inquiry:** Check current account balance.
- **Deposit and Withdrawal:** Perform transactions to deposit or withdraw money.
- **Fast Cash:** Quick withdrawal options.
- **Mini Statement:** View recent transactions.
- **Pin Change:** Update account PIN securely.

## Project Structure
- `BalanceEnquiry.java`: Handles balance inquiries.
- `Deposit.java`: Manages deposit transactions.
- `Withdrawl.java`: Manages withdrawal transactions.
- `FastCash.java`: Facilitates quick cash withdrawals.
- `MiniStatement.java`: Displays recent transactions.
- `PinChange.java`: Allows PIN updates.
- `SignupOne.java`, `SignupTwo.java`, `SignupThree.java`: Manage user signup process.
- `Login.java`: Manages user login.
- `Transactions.java`: Handles transaction-related operations.
- `Conn.java`: Database connection utility.

## Installation
1. Clone the repository:
   git clone https://github.com/radha-24/Bank-Management-System.git
2.Open the project in your favorite IDE (e.g., IntelliJ, Eclipse).
3. Ensure you have MySQL installed and running.
4. Import the mysql-connector-java-8.0.28.jar library.
5. Create a database named bank_management and import the required tables.

## Usage
1. Run the Login.java file to start the application.
2. Use the signup option to create a new account.
3. Log in using your credentials to access banking features.
 
## Dependencies
Java
MySQL
Java Swing (for GUI)
MySQL Connector/JDBC

## Contact
For any inquiries or feedback, please contact [rpdeshmukh1224@gmail.com].
