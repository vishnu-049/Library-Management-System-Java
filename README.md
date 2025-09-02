# Library Management System (Java)

This is a simple **Library Management System** implemented in Java using Object-Oriented Programming concepts.

## Features
- Add books
- Borrow and return books
- Supports Students and Teachers (User Inheritance)
- Demonstrates OOP concepts like **Inheritance, Encapsulation, and Polymorphism**

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/Library-Management-System-Java.git
2.Compile the Java files:
    javac App.java
3.Run the program:
    java App

Example Input
=== Library Menu ===
1. Show Books
2. Search Book
3. Borrow Book
4. Return Book
5. Exit
Enter choice: 1
Book id: 1 title:JAVA Fundamentals Author:james ClearAvailable:no
Book id: 2 title:Data Structures Author:colheloAvailable:no
Enter choice: 2
Enter keyword: java
Book id: 1 title:JAVA Fundamentals Author:james ClearAvailable:no
Enter choice: 3
Enter Book ID and User ID: 1 101
User 101 Borrowed : JAVA Fundamentals
Enter choice: 4
Enter Book ID and User ID: 1 101
Vishnu returned JAVA Fundamentals
Enter choice : 5
Exit.
