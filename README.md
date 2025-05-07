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

class Classroom {}
class School {
    Classroom room = new Classroom();  // Composition
}
Example:

If we remove all rooms, the school can't function

Removing the school also removes its rooms

📊 Summary Table


Abstraction	Hides internal details	Car 
interface (not engine)
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


/* this is also a  
   comment multiline */
🛠️ Commands:

javac filename.java     // Compile the program
java filename           // Run the program

Day 3:


//variable is a conatiner which holds value
//java static and strongly type language
//static:because its data type defined initailly
//after defined data type we should assign the values as per that datatype range itself it tells us java is stronlgy typed as well
//variable names can contain alll unicodes
//variable starting should be either of these _,$ or character not digit
//if we have two words in variabke anme then should follow camelcase
//if we define static variable then give all captail letters for that

P## 1. Data Types

### char
- 2 bytes

### byte
- 1 byte
- Signed (2's complement)
- Default: 0

### short
- 2 bytes
- Example: short var = 4;

### int
- 4 bytes
- Example: int var = 45;

### long
- 8 bytes
- Example: long var = 456L;

### float
- 32-bit (IEEE 754)
- Example: float var = 45.56f;

### double
- 64-bit (IEEE 754)
- Example: double var = 43.56d;

### boolean
- 1 bit
- Values: true or false
- Default: false

---

## 2. Types of Conversion

### Widening / Automatic Conversion
- Lower datatype → Higher datatype
- Automatic if sufficient range

### Downcasting / Explicit Conversion
- Higher datatype → Lower datatype
- Causes error (lossy conversion) unless explicitly typecasted
- May result in negative values

### Promotion During Expression
- If range exceeds in expression
- Automatically promoted to next datatype unless explicitly cast

### Explicit Casting During Expression
- When lower and higher datatypes are used in an expression
- Converted to higher type unless explicitly cast

---

## 3. Types of Variables

### Member / Instance Variable
- Declared inside class
- Default values assigned as per datatype
- Separate copy per object

### Static Variable
- Shared at class level
- Single copy, not per object

### Constructor Variable
- Passed via constructor
- Needs object to be used

### Local Variable
- Declared inside methods
- Limited to method scope

### Parameter Variable
- Passed as arguments to methods
- Available only within that method



Day-4:

## 📌 Reference Data Types

### 🔹 Class
- Reference type: When we create an object of a class, it creates memory in the heap.
- That variable points to the memory address.
- If we update anything with that object, it updates the value at that memory address.

---

### 🔹 String

```java
public class Stringbasics {
    public static void main(String a[]) {
        String s1 = "hello"; // goes into String Constant Pool in heap
        String s2 = "hello"; // reuses "hello" from pool if it exists

        if (s1.equals(s2)) {
            // checks content equality
        }

        if (s1 == s2) {
            // checks reference equality
        }

        String s3 = new String("hello"); // creates new object in heap

        if (s1 == s3) {
            // false – references are not equal
        }

        if (s3.equals(s1)) {
            // true – contents are equal
        }
    }

    // String literals = contents in String Constant Pool
    // Strings are immutable – updates create a new object in pool
}
🔹 Interface

public interface InnerInterfaceDetails {
    public String profession();
}

class Student implements InnerInterfaceDetails {
    @Override
    public String profession() {
        return "Masters";
    }
}

class Employee implements InnerInterfaceDetails {
    @Override
    public String profession() {
        return "Software Engineer";
    }
}
Ways to create object:


InnerInterfaceDetails infoObj1 = new Employee(); // parent reference → child object
InnerInterfaceDetails infoObj2 = new Student();  // parent reference → child object
Student s1 = new Student();                      // child reference → child object
Employee e1 = new Employee();                    // child reference → child object
🔹 Array

int[] arr = new int[5];
int[] arr2 = {0, 1, 2, 3, 4};
int arr3[] = new int[5];
Arrays hold the reference to the memory location of the elements.

🔹 Primitive & Wrapper Types
Primitive types (pass by value):


char, byte, short, int, long, double, float, boolean
Wrapper classes (reference types):


Character, Byte, Short, Integer, Long, Double, Float, Boolean
All collections use reference types only.

Use wrapper classes in collections like ArrayList, HashMap.

🔹 Auto Boxing & Unboxing

// Auto-boxing: primitive → wrapper
int var1=9;
Integer var = var1;

// Auto-unboxing: wrapper → primitive
Integer var=45;
int var1 = var;

🔹 Constant Variables

static int var = 9; // shared across class

// To prevent modification:
static final int VAR = 9;

static: one copy at class level
final: value cannot be changed

Day-5:
access specifiers:
public
private
protected
default

return types

boolean
int

method name (should be action)
camelCase(if two words)

method parameters and arguments


types of methods:

system define method: Math.max (JRE)
user defined method
overloaded methods same name of two diff methods and diff parameters
ploy morphism

overrite:subclass has same as parent class vechile and car


static: class level copy maintained
cannot use non static methods and variables inside static
cannit overide staic methods


create static method when there is no need of instance or class variables

final:make method as final whne you dont want to make any chanegs on that in further

abstarct: abstract method can be declared in abstarct class itself and only declaration can make in parent class the rest implementation can be done by child class

variable paramters: ...var
but only one variable arg can be presnet
and variable arg should be in last
