# java-core-concepts
A collection of Java examples and exercises covering core topics like OOP, data structures, algorithms, exception handling, concurrency, and design patterns. Perfect for developers looking to strengthen their understanding of Java fundamentals and build efficient applications.


This repository contains a collection of Java programming examples and exercises that cover fundamental and advanced concepts in the Java language. It is designed to help developers at all skill levels deepen their understanding of Java’s core features, including object-oriented programming, data structures, algorithms, exception handling, concurrency, and more.

Topics Covered:

Basic Syntax & Operators

Object-Oriented Programming (OOP): Classes, Inheritance, Polymorphism, Abstraction, Encapsulation

Collections Framework: Lists, Sets, Maps, Queues

Concurrency & Multithreading

Exception Handling

Java Streams API

Design Patterns: Singleton, Factory, Observer, etc.

Data Structures & Algorithms in Java

This repository is continuously updated with new examples and challenges to reinforce core Java principles. It serves as a reference for both beginner and intermediate Java developers looking to solidify their skills and build robust applications.

Day-1:
=============================

/🔁 OOP Concepts - Quick Revision
⚙️ Class & Object
Class: Blueprint/template for creating objects

Object: Instance of a class

📌 1st Pillar: Abstraction
Hiding internal details and showing only essential features

Example: You drive a car without knowing the internal engine mechanism

📌 2nd Pillar: Encapsulation
Binding data and methods into a single unit (class)

Achieved using access modifiers (private, public, etc.)

Protects data from outside interference

📌 3rd Pillar: Inheritance
Mechanism where a child class inherits properties and behaviors from a parent class

Promotes code reusability

🔸 Types of Inheritance
csharp
Copy
Edit
           [Vehicle]
               ↑
             Single
         [Car extends Vehicle]

           [Vehicle]
               ↑
         [Car extends Vehicle]
               ↑
         Multilevel
         [SportsCar extends Car]

⚠️ Multiple inheritance with classes is not supported in Java.
Instead, use interfaces to achieve it.
📌 4th Pillar: Polymorphism
Compile-time (Method Overloading)

Runtime (Method Overriding)

Allows one action to behave differently based on the object

🔗 Relationships in OOP
✅ IS-A Relationship (Inheritance)
Achieved through inheritance

Example:

kotlin
Copy
Edit
class Animal {}
class Dog extends Animal {}

Dog IS-A Animal ✅
✅ HAS-A Relationship (Association)
One class uses or contains another class's object

🔸 One-to-One
One student has one course

🔸 One-to-Many
One student has many courses

🔸 Many-to-Many
Many students take many courses

🔍 Ways to Achieve HAS-A Relationship
1. 🧩 Aggregation (Weak Association)
Uses object reference from one class to another

Both objects can exist independently

kotlin
Copy
Edit
class Student {}
class School {
    List<Student> students;  // Aggregation
}
Example:

Removing students does not destroy the school

School can still exist empty and enroll new students

2. 🧱 Composition (Strong Association)
Object of one class is created inside another class

If one is destroyed, the other is affected

java
Copy
Edit
class Classroom {}
class School {
    Classroom room = new Classroom();  // Composition
}
Example:

If we remove all rooms, the school can't function

Removing the school also removes its rooms

📊 Summary Table

Concept	Description	Example
Abstraction	Hides internal details	Car interface (not engine)
Encapsulation	Binds data + methods	Private fields with getters/setters
Inheritance	Child inherits from Parent	class Car extends Vehicle
Polymorphism	One interface, many forms	run() method in multiple classes
IS-A	Inheritance	Car IS-A Vehicle
HAS-A	Class uses another class	School HAS-A Student
Aggregation	Weak HAS-A (independent)	School–Student
Composition	Strong HAS-A (dependent)	School–Room


Day-2:

===========================
📌 What is Java?
Java is a platform-independent, object-oriented programming language.

It supports WORA (Write Once, Run Anywhere).

📦 Java Compilation & Execution Flow:
Write Java Program
→ Save with .java extension.

Compile using Java Compiler (javac) from JDK
→ Converts source code into bytecode (.class file).

Run using JVM (Java Virtual Machine)

JVM interprets bytecode and converts it to machine code.

If the bytecode uses any libraries, JRE is needed to provide class libraries.

🧩 Components:
JDK (Java Development Kit):

Contains compiler, debugger, and programming tools.

Includes JRE + development tools.

JRE (Java Runtime Environment):

Contains JVM and class libraries.

Cannot be used to write Java programs (only run them).

JVM (Java Virtual Machine):

Converts bytecode to machine code.

Includes JIT (Just-In-Time) Compiler for performance.

💡 Summary:
You need JDK to write and run Java programs.

JDK = JRE + JVM + Development Tools

JRE = JVM + Class Libraries

🧵 Java Editions:
JSE (Java Standard Edition): Core Java – classes, objects, OOP concepts.

JEE (Java Enterprise Edition / Jakarta Edition):
APIs for enterprise apps – transactions, rollback, commit, servlets, JSP, eCommerce.

JME (Java Micro Edition): APIs for mobile apps.

⚙️ Java File Rules:
File name must be the same as the public class name.

A file can only have one public class.

The class must contain the main method to run.

🔁 public static void main(String[] args)
public: JVM can access it from outside.

static: JVM doesn’t need to create an object to call it.

void: It does not return anything.

String[] args: JVM can pass arguments to the program.

📝 Comments in Java:
Single-line comment: // this is comment

Multi-line comment:

java
Copy
Edit
/* this is also a  
   comment multiline */
🛠️ Commands:
bash
Copy
Edit
javac filename.java     // Compile the program
java filename           // Run the program
