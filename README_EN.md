# Bank Account Management System

This project is a bank account management system that allows you to create, view, update, and delete accounts and transactions. It was developed using Spring Boot for the backend and PostgreSQL as the database.

## 🔨 Project Features

- **Bank Account Management:**
    - Create new bank accounts.
    - Search for accounts by ID.
    - Update existing account information.
    - Delete bank accounts.

- **Transaction Management:**
    - Record transactions associated with bank accounts.
    - Search for transactions by ID and account.
    - Update existing transactions.
    - Delete transactions.

### Visual Example of the Project
![Screenshot 2024-08-18 222701](https://github.com/user-attachments/assets/9a6dcfcf-1edb-452b-b297-b4a52450cc37)
![Screenshot 2024-08-18 222923](https://github.com/user-attachments/assets/6523a344-2705-4465-9cb1-8aa3987dcad5)
![Screenshot 2024-08-18 222949](https://github.com/user-attachments/assets/cf660c86-5eb1-4b50-aba0-5fc68ed83fb5)
![Screenshot 2024-08-18 224313](https://github.com/user-attachments/assets/f023e7af-f2da-4be3-8c9e-eaa0f3ee3f4b)

## ✔️ Techniques and Technologies Used

- **Language:** Java
- **Framework:** Spring Boot
- **Database:** PostgreSQL
- **ORM:** Hibernate/JPA
- **Dependencies:** Spring Data JPA, Spring Web, Jakarta Persistence API, etc.

## 📁 Project Structure

1. **Configurations:**
    - `DatabaseConfig.java`: Database configuration.

2. **Controllers:**
    - `AccountController.java`: Manages the routes for bank accounts.
    - `TransactionController.java`: Manages the routes for transactions.

3. **Services:**
    - `AccountService.java`: Business logic for bank accounts.
    - `TransactionService.java`: Business logic for transactions.

4. **Repositories:**
    - `AccountRepository.java`: Database access for bank accounts.
    - `TransactionRepository.java`: Database access for transactions.

5. **Models:**
    - `Account.java`: Representation of a bank account.
    - `Transaction.java`: Representation of a transaction.

6. **Additional Configurations:**
    - `application.properties`: General application settings.

## 🛠️ Running the Project

1. **Prerequisites:**
    - Java 17 or higher installed.
    - PostgreSQL configured.

2. **Steps to Run:**
    1. Clone the repository.
    2. Configure the database in `application.properties`.
    3. Run the command `./gradlew bootRun` to start the server.

## 🌐 Deployment

- For deployment, you can use services such as Heroku, AWS, or DigitalOcean. Ensure that environment variables are correctly configured for the production environment.
