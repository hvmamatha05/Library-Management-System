# Library-Management-System

## Objective
A mini library system to manage books and users using Object-Oriented Programming in Java.

## Tools Used
- Java
- Notepad
- Terminal / Command Prompt

## Concepts Covered
- OOP: Classes, Objects, Encapsulation
- Abstraction (each class handles its own data)
- ArrayList for storing books and users
- IS-A and HAS-A relationships
- Method definitions per responsibility
- Constructor chaining basics

## How to Run
```
javac LibrarySystem.java
java LibrarySystem
```

## Features
- Add books to the library
- Register users
- Issue a book to a user
- Return a book
- View all books with availability status
- View all registered users

## Project Structure
```
LibrarySystem.java
  ├── class Book      → bookId, title, isIssued, display()
  ├── class User      → userId, name, display()
  └── class Library   → addBook(), addUser(), issueBook(), returnBook(), showAll()
```

## Sample Output
```
Book added: Java Programming
Book added: Data Structures
User registered: Mamatha

--- Book List ---
Book ID: 101 | Title: Java Programming | Status: Available
Book ID: 102 | Title: Data Structures | Status: Available

Book 'Java Programming' issued to user 1
Book already issued.

Book 'Java Programming' returned successfully.
```

## Key Learnings
- How to split responsibilities across multiple classes
- HAS-A relationship: Library HAS-A list of Books and Users
- How isIssued flag tracks book availability
- Importance of encapsulation in real-world systems
