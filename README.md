# 🏦 ATM Simulator System

A **Java-based ATM Simulator System** that replicates the core functionalities of an Automated Teller Machine (ATM). The application is developed using **Java Swing** for the graphical user interface and **Microsoft SQL Server** as the backend database for securely storing customer and transaction data.

This project demonstrates core banking operations such as account creation, authentication, deposits, withdrawals, balance enquiry, PIN management, and transaction history.

---

## 📌 Features

- 👤 User Registration (Multi-step Account Creation)
- 🔐 Secure Login using Card Number and PIN
- 💰 Cash Deposit
- 💸 Cash Withdrawal
- ⚡ Fast Cash
- 📊 Balance Enquiry
- 📄 Mini Statement (Transaction History)
- 🔑 PIN Change
- 🗃️ Store customer and transaction details in SQL Server
- 🖥️ User-friendly ATM interface using Java Swing

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Core Programming |
| Java Swing | Graphical User Interface |
| JDBC | Database Connectivity |
| Microsoft SQL Server | Database |
| AWT | GUI Components |
| SQL | Database Queries |

---

## 📂 Project Structure

```
ATM-Simulator-System/
│
├── src/
│   └── bank/
│       └── management/
│           └── system/
│               ├── Login.java
│               ├── Signup.java
│               ├── Signup2.java
│               ├── Signup3.java
│               ├── Deposit.java
│               ├── Withdrawl.java
│               ├── FastCash.java
│               ├── BalanceEnquiry.java
│               ├── Mini.java
│               ├── Pin.java
│               ├── main_Class.java
│               ├── Con.java
│               └── ...
│
├── icon/
│   ├── atm2.png
│   └── ...
│
├── images/
│   ├── login.png
│   ├── signup.png
│   ├── dashboard.png
│   ├── deposit.png
│   ├── withdraw.png
│   ├── balance.png
│   └── mini-statement.png
│
└── README.md
```
---

## 🚀 Features Overview

### 📝 Account Creation
- Multi-step registration process
- Personal information collection
- Additional account details
- PIN generation
- Data stored securely in SQL Server

### 🔐 Login
- Card Number authentication
- PIN verification
- Secure access to ATM services

### 💰 Deposit
- Deposit money into an account
- Transaction stored in the database
- Updated balance reflected immediately

### 💸 Withdrawal
- Withdraw available balance
- Prevents invalid transactions
- Automatically updates account balance

### ⚡ Fast Cash
- Quick withdrawal of predefined amounts

### 📊 Balance Enquiry
- Displays the current account balance
- Calculates balance from transaction records

### 📄 Mini Statement
- Displays recent transaction history
- Includes deposits and withdrawals

### 🔑 PIN Change
- Allows users to securely change their ATM PIN
- Updates PIN in the database

---

## 🗄️ Database

The application uses **Microsoft SQL Server** as the backend database.

### Main Tables

- **signup**
- **signup2**
- **signup3**
- **login**
- **bank**

The **bank** table stores all transactions including:

- PIN
- Date
- Transaction Type
- Amount

The current balance is calculated by summing deposits and subtracting withdrawals.

---

## ⚙️ Installation

### Prerequisites

- Java JDK 8 or later
- Microsoft SQL Server
- NetBeans / Eclipse / IntelliJ IDEA
- JDBC Driver for SQL Server

---

### Clone Repository

```bash
git clone https://github.com/ATM-Simulator-System.git
```

---

### Configure Database

Create a SQL Server database.

---

### Run Project

1. Open the project in your Java IDE.
2. Configure the SQL Server database connection.
3. Run `Login.java`.
4. Register a new account or log in with existing credentials.

---

## 🔒 Security Features

- PIN-based authentication
- Database-backed user validation
- Transaction records stored securely
- Input validation for banking operations

---

## 🔮 Future Improvements

- Money Transfer
- Account Balance Dashboard
- Interest Calculation
- Email/SMS Notifications
- Password Encryption
- Admin Panel
- Transaction Search
- Account Lock after Multiple Failed Logins
- PDF Statement Generation
- Responsive UI Design

---

## 👨‍💻 Author

**Pallavi Mahajan**

**Tech Stack:** Java • Java Swing • JDBC • Microsoft SQL Server

---

## ⭐ Support

If you found this project useful, please consider giving it a ⭐ on GitHub.

It helps others discover the project and motivates further improvements.
