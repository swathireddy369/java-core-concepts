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



Day 7:

 class Employee{
  private Employee(){ //it should be same as class name to idefiy easily and it should not have any return type 
    // it should be tye as abstract,static and final
    // if it is abstract then it should be declraed in parent and define din child right in inheritance concpet as the first step we cannot inherit construtor becuase whereevrr constru present it shoud same as class class it's not achive in child class so we cannot inherit and overriden so no ise of abstract
    // final: final defines the method should not be mutated as we are mutating the constructor so it should allow
  //static if we put static it cannot use not static (instance variables) but our construtor assigns or updates values of instance variables so dont put static 

    System.out.println("con");
  }
  public static Employee getInstance(){ //it should be public and static because non static should require instance to call 
    return new Employee();
  }
}
//what if we put private access specifier for construtor so then we cannot create object of calls from outside this class the main purpose of construtor is create instanc eof a class if we put [privet we cannot achieve that ]
//  so we should not ok then if we put cons private we have to have explore  (return)that by public another method to create object frommoutside otherwise we cannot create objetct  for it
 public class Constructor {
    public static void main(String  args[]){
      Employee empObj=Employee.getInstance();
      
    }
}
public class ConstructorChaining {
    public static void main(String args[]){
   Person pObj=new Person();
   
    }
}
class Person extends ConstructorChainingParent{
    int age;//localor class variable can  be assigned default value.
    String name;
 ///no args custom
  Person(){
     this(33);//this must be in the first statement this does know before 
    //  super(33);
    System.out.println("custom con"+age+""+name);
  }
  Person(int age){
    this(age,"swathi");
    //   super(33);
    this.age=age;
  }
  Person(int age,String name){
     super(33);
    this.age=age;
    this.name=name;  }
}

parent
 public class ConstructorChainingParent {
    int age;
      ConstructorChainingParent(int age){
        this.age=age;
        System.out.println("Im parent"+age);
      } 
}
Java Constructor Concepts: Organized Notes
Let me organize your notes about Java constructors, constructor chaining, and access modifiers into a clear, structured format.
1. Constructor Basics

Definition: A constructor is a special method used to initialize objects
Characteristics:

Must have the same name as the class
No return type (not even void)
Executes automatically when an object is created



2. Constructor Access Modifiers
Private Constructors

Makes direct instantiation from outside the class impossible
Use cases:

Singleton pattern
Factory method pattern
Utility classes (static methods only)


Example:

javaclass Employee {
  private Employee() {
    System.out.println("con");
  }
  
  public static Employee getInstance() {
    return new Employee();  // Factory method
  }
}
Why Constructor Can't Be...

Abstract: Constructors can't be inherited or overridden (must have same name as class)
Static: Constructors initialize instance variables, static methods can't access non-static members
Final: Not needed as constructors can't be overridden anyway

3. Constructor Chaining

Definition: Calling one constructor from another within the same class
Implementation: Using this() keyword
Rules:

this() must be the first statement in the constructor
Only one this() call allowed per constructor



4. Constructor and Inheritance

Child classes don't inherit parent constructors
Parent constructor is called before child constructor
If no explicit call, super() is implicitly called
Using super(parameters) to call specific parent constructor

5. Visual Representation
artifact: constructor-conceptsJava Constructor ConceptsDiagram 6. Constructor Execution Flow Example
artifact: execution-flowConstructor Execution Flow ExampleDiagram 7. Code Example Analysis
Example 1: Private Constructor with Factory Method
javaclass Employee {
  private Employee() {
    System.out.println("con");
  }
  
  public static Employee getInstance() {
    return new Employee();
  }
}

public class Constructor {
  public static void main(String args[]) {
    Employee empObj = Employee.getInstance();
  }
}
Output: con
Key Points:

Private constructor prevents direct instantiation
Factory method provides controlled object creation
Could be modified to implement Singleton pattern

Example 2: Constructor Chaining
javaclass Person extends ConstructorChainingParent {
  int age;
  String name;
  
  Person() {
    this(33);  // Calls Person(int)
    System.out.println("custom con" + age + "" + name);
  }
  
  Person(int age) {
    this(age, "swathi");  // Calls Person(int, String)
    this.age = age;  // Note: This overwrites value set in Person(int, String)
  }
  
  Person(int age, String name) {
    super(33);  // Calls parent constructor
    this.age = age;
    this.name = name;
  }
}

class ConstructorChainingParent {
  int age;
  
  ConstructorChainingParent(int age) {
    this.age = age;
    System.out.println("Im parent" + age);
  }
}
Execution Flow:

Person() calls Person(33)
Person(33) calls Person(33, "swathi")
Person(33, "swathi") calls ConstructorChainingParent(33)
Parent constructor executes, prints "Im parent33"
Person(33, "swathi") sets age=33, name="swathi"
Person(33) sets age=33 again (redundant)
Person() prints "custom con33swathi"

8. Best Practices

Keep constructors simple and focused on initialization
Follow the constructor chaining pattern for parameter variations
Use factory methods for complex object creation logic
Consider validation in constructors to ensure object integrity
Minimize side effects in constructors (like network calls or file I/O)



Week-3:

Day 8:monday

stack ,heap and garbage collector mark and sweep

stack:stroes primitive variables and references to the objects which are stored in heap
whenever we create a instance of a object the object is going to store at heap and that heapmemory reference stored in stack

whenever string encounters in our code it simple stores a reference obj in string constant pool ,if we create another sting with same first it checks whether string constant contain that value or not if it does it simply store that refrence only instead of creating new one, when we say new String then it creas new constant pool

as we know jvm periodaically runs the GC here when gc stars running all the appliation progess or api is being passed till GC complets its execution 
we have serial GC:stops the world and runs one thread
parallel Gc:runs multiple threads to collect still pasue the applicatipn api but little bit better 
concurrent gc:depricated in java 9 because it does not perform compact memory collection after swept  and removed in java 14 it runs parallely with app apis to reduce pause but it reslt in fragment left space not compact one
GI GC : here till java 9 collector default gc remaining 3 of does compact memory collection

stack conatin smultple threads but in heap has one thred****************************(need to focus)
and in stack whenever a block is started it allocates a frame for that block as go throguh when encounter block end the frame from stack would be deleted in last in first out order
 here while allocation or code is being compiled if encounters a open brance it assumes it has new method and it allocate new frmae for that in memory
but if that block contains any reference variabke then reference variable container would be deleted but not the actula reference from heap so to clear that actual memory space in heap GC will come into play 
 JVM throughly runs GC to check whether heap does conatins any unreferenced objects from stack it if does then simply remove it from heap by using mark and sweep algorithm

as refrences are concerd we ahve 3 types of reference  
strong reference: when GC runs if it encounters  a string ref just check whther ref exit in stack or not if not only removes it from heap 

but in week ref case GC simply removes the memory for that reference in heap irrespective of checking from stack ,althougth if try to access it from stack simple gives numm pointer exception i think gives null

whereas in case of sensitive it is similar to week but before it does cleanup only in case of emergency 



 how GC works by using mark and sweep algoriythm:

 here in heap we have two phases

 young phase and older phase
 young has 3 block eden,survivor0,survivor1

 first when create object it goes into young eden phase as soon as GC runs as it follows mark an dsweep algo it first makrs the object which are unreferenced okay then it removes fron eden and move the nremaining objs to su0 and update the age by 1, beofre next Gc runs if we create any obj it goes to eden first then now if gc runs it again mark nodes and sweep them and move object to su1 and incrementin age accordingly then after GC ruuning 3rd time it moves to su0 agin it circulate between 2block especially once moves to survivor space of new it goes eden here one facto every heap has some threeshold it object age reahces threeshold it simple mv=oves to old generation as major gen for young we call minor in old gen as well GC folow same process but as the old the process it little bit slow compare to young and we have one more block non heap meta space it stores class variavles ,static,static final constants beofre java7 we have peremanent space but it inclues in heap when it fills it throuws error as heap as limited space okay so that it moved to out of heap and named as meta space it stores info about class 


Java Memory Management: Stack, Heap, and Garbage Collection
I've organized your notes into a comprehensive explanation of Java memory management. Here's a clear breakdown of the concepts:
Stack

Purpose: Stores primitive variables and references to objects in heap
Characteristics:

Each thread has its own stack
When a new code block starts, a new frame is allocated on the stack
Works in Last-In-First-Out (LIFO) order
When a block ends, its frame is removed from the stack
Limited in size compared to heap



Heap

Purpose: Stores actual objects created during runtime
Characteristics:

Single shared memory area across all threads
Managed by Garbage Collector
Divided into generations for efficient memory management



Heap Generations

Young Generation:

Eden Space: Initial allocation area for new objects
Survivor Spaces (S0 and S1): Objects that survive GC cycles move here
Objects cycle between S0 and S1, with age incremented each cycle


Old Generation (Tenured):

Objects that survive multiple GC cycles and reach age threshold
Major GC runs here (slower but less frequent)



String Constant Pool

Special area in memory that stores string literals
If creating a string with same value, JVM checks if it exists in pool first
Using new String() forces creation of a new object regardless of pool content

Metaspace (Non-Heap)

Replaced PermGen space since Java 8
Located outside of heap memory
Stores:

Class metadata
Static variables
Static final constants



Garbage Collection

Purpose: Reclaim memory occupied by unused objects
Mark and Sweep Algorithm:

Mark: Identify live objects (referenced from stack)
Sweep: Remove unmarked objects and compact memory



GC Process

Minor GC: Runs on Young Generation

Marks unreferenced objects in Eden
Moves surviving objects to S0/S1, incrementing age
Objects circulate between survivors until reaching threshold


Major GC: Runs on Old Generation

Slower but less frequent
Same marking and sweeping process



Reference Types

Strong References: Normal object references

GC only removes if no references exist in stack


Weak References: Removed during next GC cycle

Regardless of stack references
Accessing after GC returns null


Soft References: Similar to weak but cleared only when memory is low

Used for caching scenarios

https://claude.ai/public/artifacts/db4d5c3b-50f8-425d-bd40-77c67da9e741


===========================================================================================

Day 8:Tuesday

Class Types:
Concrete class:
A class that we can create instance for it and all methods in this class should contain implementation. It may be implemented by interface or it can be extended from abstract parent class
by achieving abstraction in this point. Access modifier would be public or private package.

Abstract class:
A key which abstract key in front of class name. As it suggests, it should have at least one abstract method and it may contain implementation methods remaining.
❌ we cannot create instance for it. Access modifier would be public or private package.

Super Class and Sub Class:
Also known as parent and child class. A class which can be inherited by other class called child class, and a class which is inherited is called parent.
Always a parent class can refer to child object.
When we call child class constructor by default it calls parent constructor under the hood — it contains super() for default constructor.
If it is a parameterised one, we should call super() manually.

Object:
Let say A is parent for B class, so B is child. Then for A the object is parent class:

java
Copy
Edit
Object obj = new A();
Object obj = new B();
obj.notifyAll();
Nested Class:
Static Nested Class:
A class inside another class is called nested class.
Let’s say a particular class is being used in only one class, then instead of creating new file for that we can create class inside the class where we were using this class.

java
Copy
Edit
class A {
    static class B {
        public void print() {
        }
    }
}
So as B is static class, no need of object creation for outer class.
But it cannot access instance members of parent — only static members can access.

java
Copy
Edit
A.B abobj = new A.B();
abobj.print();
Non-Static Nested Class:
inner class

member class

anonymous class

Inner Class:
Same like a class inside another class. Here we should create object for outer class as well if we want to use members of nested class.

java
Copy
Edit
class A {
    class B {
        public void print() {
        }
    }
}

// A obj = new A();
B bobj = obj.new B();
bobj.print();
Member Class:
Member class defines a class which is defined inside a member of another class
so that it can be accessed inside that block itself.
As we know, once end brace encounters, its frame will be removed from stack.

Its access modifier is private because it cannot be used outside the block.
If we want to use outside, have to create one public member inside that block and expose that instance of private class.

java
Copy
Edit
class A {
    public void display() {
        class B {
            System.out.println("print");
        }
        B bobj = new B();
        bobj.print();
        
        public expose() {
            B bobj = new B();
        }
    }
}
Anonymous Class:
Anonymous defined as a class that does not have any class name.
We usually provide class right? Let say we have a method in abstract class and we need to provide implementation for that — that is no other usage of that —
then simply use anonymous class to provide implementation without creating class with class name.

java
Copy
Edit
abstract class A {
    public abstract void display();
}

A aobj = new A() {
    public void display() {
        System.out.println("hii hello");
    }
};




Day-9:wednesday

Understanding Java Generics
Basic Generic Class
javaclass check<T> {
    T ob;

    public void assign(T ob) {
        System.out.println(ob);
    }

    public T getValObject() {
        return ob;
    }
}
Generic Subclass
java// Generic subclass - preserves type parameter
class sub<T> extends check<T> {}

// Non-generic subclass - fixes type parameter
class sub1 extends check<Integer> {}
Multiple Type Parameters
javaclass multiple<T, K> {
    private T key;
    private K val;

    public void assign(T key, K val) {
        System.out.println(key + "" + val);
    }

    // public T getValObject() {
    //     return key;
    // }
    // public K getValObject1() {
    //     return val;
    // }
}
Generic Method
javaclass check2 {
    public <T> void assign(T ob) {
        System.out.println(ob);
    }
}
Bounded Type Parameters
Upper Bound
java// Single upper bound
class upper<T extends Number> {
}

// Multiple bounds
class multibound<T extends Number, inf1, inf2> {
}
Wildcard Notes
java// With wildcards, we can have different types for each parameter
// public void method1(List<T> val1, List<K> val2) {}

// With generic methods, we use a single type parameter
// public <T> void method1(List<T> val1) {}

Wildcard methods can support lower bounds
Generic methods with single type cannot handle multiple types
For multiple types, we need multi-generic methods

Unbounded Type Parameters
javaclass sub3 {
    public <T> void setvashe() {
        // Here unbounded - can pass any type
    }
}
Important Concepts

Type erasure: After compiling, generic types are erased and replaced with Object in bytecode
Raw types: When we don't mention any type, just pass values
Upper bound: We can pass the specified type and its children (e.g., Number and Number's child types)
Lower bound: We can pass the specified type and its parent types
Unbounded: Can pass any type

Usage Example
javapublic class GenericExamples {
    public static void main(String args[]) {
        // Using generic class with Integer
        check<Integer> obj = new check<>();
        obj.assign(3);
        // obj.assign("swathi"); // This won't work - type safety

        // Generic subclass
        sub<Integer> st = new sub<>();
        st.getValObject();
        
        // Raw type usage
        sub sb1 = new sub();
        sb1.getValObject();
        
        // Multiple type parameters
        multiple<Integer, String> obj4 = new multiple<>();
        obj4.assign(1, "swathi");

        // Generic method
        check2 gm = new check2();
        gm.assign(4);
        
        // Upper bound example
        upper<Integer> u = new upper();
    }
}

//////////////////////////
/// 
/// Java POJO and Enum Concepts
POJO (Plain Old Java Object)
A POJO is a simple Java class with the following characteristics:

Uses public access modifier for the class
Contains variables (fields) with their getter and setter methods
Can extend other classes or implement interfaces
Has a public default constructor
Does not use annotations like @Entity (remains framework-independent)

Common Use Cases for POJOs:

Data Transfer/Mapping:

When receiving data from clients (e.g., JSON like {id, name, address})
Acts as a mapping class to standardize variable names between client and server


In Application Architecture Flow:

Typical flow: Controller → Service → Repository → POJO (entity objects)
Used to represent data structures consistently across application layers



Example of a POJO:
javapublic class StudentPojo {
    // Private fields
    private int id;
    private String name;
    private String address;
    
    // Default constructor
    public StudentPojo() {
    }
    
    // Parameterized constructor
    public StudentPojo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    // Getter and Setter methods
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
Enum (Enumeration)
An Enum is a special type of class in Java that represents a collection of constants:

Declared using the enum keyword
Implicitly extends java.lang.Enum class (cannot extend any other class)
Can implement interfaces
Can have variables, constructors, and methods
Can have abstract methods (but each constant must provide implementation)
Constructor is always private (even default constructor becomes private in bytecode)
No other class can extend an enum
No need for instance creation as constants are static and final
Ordinal values start from 0 automatically

Advantages over Static Final Constants:

Type-safety: Methods can accept only valid enum constants
Built-in methods: values(), valueOf(), ordinal(), name()
Can associate methods and additional data with each constant
Prevents invalid values being passed to methods

Example of an Enum:
javapublic enum DayOfWeek {
    MONDAY(1, "day1") {
        @Override
        public String specialAboutMyDay() {
            return "Shiva";
        }
    },
    TUESDAY(2, "day2") {
        @Override
        public String specialAboutMyDay() {
            return "Yallamma Thalli";
        }
    },
    WEDNESDAY(3, "day3") {
        @Override
        public String specialAboutMyDay() {
            return "Vinayaka";
        }
    },
    THURSDAY(4, "day4") {
        @Override
        public String specialAboutMyDay() {
            return "Ayyappa Swamy";
        }
    },
    FRIDAY(5, "day5") {
        @Override
        public String specialAboutMyDay() {
            return "Laxmi Devi";
        }
    },
    SATURDAY(6, "day6") {
        @Override
        public String specialAboutMyDay() {
            return "Lord Venkateswara Swamy";
        }
    },
    SUNDAY(7, "day7") {
        @Override
        public String specialAboutMyDay() {
            return "All Devotionals";
        }
    };
    
    // Instance variables
    private int id;
    private String day;
    
    // Private constructor (enum constructors are always private)
    DayOfWeek(int id, String day) {
        this.id = id;
        this.day = day;
    }
    
    // Getter methods
    public int getId() {
        return id;
    }
    
    public String getName() {
        return day;
    }
    
    // Other methods
    public String toLowerCase(String day) {
        return day.toLowerCase();
    }
    
    // Abstract method - each enum constant must implement
    public abstract String specialAboutMyDay();
    
    // Regular method
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
Alternative using Static Final Constants (Less Preferred):
javapublic class DayConstants {
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;
    
    // Disadvantage: This approach is not type-safe
    public static boolean isWeekend(int day) {
        return day == SATURDAY || day == SUNDAY;
        // Nothing prevents passing invalid values like 10 or -1
    }
}
Final Classes in Java
When a class is declared with the final keyword:

It cannot be extended by any other class
Typically used when you want to prevent inheritance

Example:
javapublic final class ImmutableClass {
    // This class cannot be extended
}

// This would cause a compilation error:
// class ChildClass extends ImmutableClass { }
Common Enum Methods

values(): Returns array of all enum constants
valueOf(String): Converts a string to the corresponding enum constant
ordinal(): Returns the position of the enum constant (zero-based)
name(): Returns the name of the enum constant as declared
https://claude.ai/public/artifacts/8fa2755c-dbc4-4f53-b86f-4d098503e345



Day-10 thursday

Singleton Design Pattern Summary
I've organized and corrected your notes on singleton design patterns and immutable classes. Here's a summary of the key concepts:
Singleton Implementation Methods

Eager Initialization

Instance created when class loads
Simple but potentially wastes memory if unused


Lazy Initialization

Creates instance only when needed
Not thread-safe - can create multiple instances with concurrent threads


Synchronized Method

Thread-safe using synchronized keyword
Performance issues due to locking mechanism for every call


Double-Checked Locking (DCL)

Improved performance with thread safety
Key corrections:

Need volatile keyword for thread visibility
Don't create second instance outside synchronized block




Bill Pugh Singleton (Holder Pattern)

Uses static helper class
Thread-safe without synchronization
Lazy loading - inner class loads only when needed
Recommended for Java applications


Enum Singleton

Simplest implementation
Thread-safe by JVM design
Automatically handles serialization
Highly recommended approach



Immutable Class Implementation
Key principles:

Class declared as final (cannot be extended)
All fields private and final
No setter methods
Deep copy for mutable objects in constructor
Return defensive copies from getters for mutable objects

The diagram and code samples have been updated to reflect these corrections. The main technical issues in your original code were:

In the Double-Checked Locking implementation, you were creating the instance twice
Missing the volatile keyword in DCL for proper thread visibility
Needed consistent defensive copying in your immutable class

Bill Pugh and Enum approaches are indeed the best singleton implementations for most Java applications, combining thread safety, lazy initialization (for Bill Pugh), and clean code.

// 1. Eager Initialization
public class SingleTonClass {
    // Instance created at class loading time
    private static SingleTonClass db = new SingleTonClass();

    // Private constructor prevents external instantiation
    private SingleTonClass() {}

    // Public access method
    public static SingleTonClass getInstance() {
        return db;
    }
}
// Problem: Memory wastage if instance never used

// 2. Lazy Initialization
class Lazy {
    // Instance not created until needed
    private static Lazy db;

    private Lazy() {}

    public static Lazy getInstance() {
        if (db == null) {
            db = new Lazy(); // Created only when needed
        }
        return db;
    }
}
// Problem: Not thread-safe - multiple instances possible with concurrent threads

// 3. Synchronized Method
class Sync {
    private static Sync db;

    private Sync() {}

    // Thread-safe but performance penalty
    synchronized public static Sync getInstance() {
        if (db == null) {
            db = new Sync();
        }
        return db;
    }
}
// Problem: Performance overhead due to locking for every method call

// 4. Double-Checked Locking (CORRECTED)
class DoubleCheck {
    // volatile ensures visibility across threads
    private static volatile DoubleCheck db;

    private DoubleCheck() {}

    public static DoubleCheck getInstance() {
        if (db == null) {
            synchronized (DoubleCheck.class) {
                if (db == null) {
                    db = new DoubleCheck();
                }
            }
        }
        return db; // Return once, no duplicate creation
    }
}
// Better performance with thread safety

// 5. Bill Pugh Singleton (Holder Pattern)
class BillPugh {
    private BillPugh() {}
    
    // Inner static helper class - loaded only when getInstance is called
    private static class SubClass {
        private static final BillPugh obj = new BillPugh();
    }
    
    public static BillPugh getInstance() {
        return SubClass.obj;
    }
}
// Best approach: Lazy loading, thread-safe, no synchronization needed

// 6. Enum Singleton
enum EnumSingleton {
    INSTANCE;
    
    // Add methods and fields as needed
    public void doSomething() {
        // Implementation
    }
}
// Usage: EnumSingleton.INSTANCE.doSomething();
// Thread-safe by JVM, handles serialization automatically

// Immutable Class Example
final class ImmutableClass {
    private final int id;
    private final ArrayList<Integer> list;
    
    public ImmutableClass(int id, ArrayList<Integer> list) {
        this.id = id;
        // Deep copy in constructor
        this.list = new ArrayList<>(list);
    }
    
    public int getId() {
        return id; // Primitive type, no need for defensive copy
    }
    
    public List<Integer> getList() {
        // Return defensive copy to prevent modification
        return new ArrayList<>(list);
    }
}
// Thread-safe without synchronization, good for shared resources
https://claude.ai/public/artifacts/515e2dd8-7e62-4b9a-8f31-94c606e003ae

Interface:
Organized Notes on Java Interfaces
Basic Interface Concepts

Interface is a system where two systems connect without knowing each other
Default access specifier for interface and its methods is public
Abstract methods must be implemented by classes that implement the interface
Variables in interfaces are implicitly static final constants
Cannot create objects for interfaces, only implement them

Nested Interfaces

Interfaces can contain other interfaces (nested interfaces)
Classes can also contain interfaces
If a class implements parent interface, it can access both parent and child interface methods
If a class implements only child interface, it can only access child methods
When interface is nested in a class, it's implemented using ClassName.InterfaceName

Java 8 Interface Features

Default methods: provides implementation in interface itself

Can be overridden in implementing classes
Added to avoid breaking existing implementations when interface evolves
Access specifier is implicitly public


Static methods: cannot be overridden but can be accessed using interface name

Can only access static members
Access specifier is implicitly public



Java 9 Interface Features

Private methods: only accessible within the interface

Used to avoid code duplication between default methods
Increases readability and reusability


Private static methods: only accessible within static methods of the interface

Can only be used in static methods of the interface



Implementation Rules

Classes must implement all abstract methods of interfaces they implement
Cannot override static methods from interfaces
Cannot modify access specifiers when overriding interface methods
Java Interface EvolutionImage Java Interface Example CodeCode // Interface Basic Structure
public interface Bird {
    // Abstract methods - implicitly public and abstract
    void canBreath();  // Must be implemented by implementing classes
    void fly();        // Must be implemented by implementing classes
Java Interface Concepts - Organized Notes
I've organized your notes on Java interfaces while keeping your original language style. Here are the key concepts:
Key Points About Interfaces

Basic Purpose

Interface is a system where two systems connect without knowing each other
Cannot create objects for interfaces, only implement them
Provides abstraction and allows multiple inheritance


Access Modifiers

Default access modifier for interface and its methods is public
Cannot modify access modifiers while overriding interface methods


Members of Interface

Abstract methods: no implementation, must be implemented by classes
Variables: implicitly public static final constants
All abstract methods must be implemented by non-abstract implementing classes



Java 8 Interface Features

Default Methods

Added to avoid breaking existing implementations when interface evolves
Provides implementation in interface itself
Can be overridden in implementing classes
Access modifier is implicitly public


Static Methods

Provides utility methods related to interface
Cannot be overridden but can be accessed using interface name
Can only access static members
Access modifier is implicitly public



Java 9 Interface Features

Private Methods

Only accessible within the interface
Used to avoid code duplication between default methods
Increases readability and reusability


Private Static Methods

Only accessible within static methods of the interface
Can only be used in static methods



Nested Interfaces

Interface within Interface

Can be accessed using Parent.Child syntax
If a class implements parent interface, it can access both parent and child methods
If a class implements only child interface, it can only access child methods


Interface within Class

Accessed using ClassName.InterfaceName
Provides logical grouping and encapsulation
Can be implemented by any class



Technical Clarifications
I noticed some technical points that might need clarification:

The statement "if a class implements parent interface then class can be accessible for both parent and child methods" is only true if you're specifically referring to parent interfaces that contain nested interfaces. Normally, implementing an interface doesn't automatically give access to other interfaces.
In Java 8+, default methods are not package-private - they are implicitly public, just like abstract methods.
Your commented code for Java 9 private methods is correct - they can only be used within the interface itself and are useful for avoiding code duplication.

https://claude.ai/public/artifacts/8794d598-f822-4b64-820f-9abbcdc31bfd



Day-11: friday

Functional interface:
FunctionalInterfaceEx
FunInterfaceImpl


Reflection:


import java.lang.reflect.*;
//Reflection defines as a method of examining the class,accessspecifiers ,methods and variables in runtime.
// it can also changes the bhehaviour of it
//how it changes:
// the reflection process can happen in runtime becuase it creates a class object of Class
//this Class represents the class which are running in jvm 
//at that point jvm creates classobj for that Class to access thses classes
// once obj is created we can get all meta indformation about partilcur class
// so that first we need to get particulr class obj right
// here we have 3 ways to get classObj of our class
//1. Class cObj=class.forName("Eagle");
//2. Class cObj=Eagle.class()
//3. Eagle eobj=new Eagle();
//   Class cObj=eobj.newInstance();
public class ReflectionCheck {
    public static void main(String[] args) {
        /// class reflection checkingh
        /// 1.
        //   Class<?> cObj3 = Class.forName("Eagle"); 
        // System.out.println(cObj.getName());
        // 2. 
        // Class cObj1=Eagle.class;
        //  System.out.println(cObj1.getName());
        // //  3.
        // Eagle eobj=new Eagle();
        // Class cobj=eobj.getClass();
        //  System.out.println(cobj.getName());
        //     System.out.println(cobj.getFields());

            //method reflcetion
            Class mObj=Eagle.class;
            Method allmethods[]=mObj.getMethods();
            Method decMethods[]=mObj.getMethods();
            for(Method method2:allmethods){
                System.out.println(method2);
            } 
              for(Method method2:decMethods){
                System.out.println(method2);
            
            } 
            Object eobj=new Eagle(); //so cannot create instance as i made class as single but stiil throgh refle tion i can make it lets see
             Constructor con=mObj.getConstructor("Eagle");
             con.setAccessible(true);
             Eagle ealgePrivateConobj=(Eagle)con.newInstance();//seee its private cons and single calls still here able to clreate class so this is also a disadavntag

            Method method =mObj.getMethod("eat", Integer.class);
            method.invoke(eobj, 12);

              //fileds reflcetion
            Class fObjClass=Eagle.class;
            Field[] fileds=fObjClass.getDeclaredFields();
            for(Field field:fileds){
                System.out.println(field);
            }
        Field fed=fObjClass.getDeclaredField("age");
        fed.setAccessible(true);
        fed.set(fObjClass,9);

    }//here it made to change private variable behavious as well so it voilets the oops conpet encapsilatin so this is one of the disadvnatgae

}

 class Eagle {
    private int age;
    public String name;
    private Eagle() {//singleton i made this singleton
        System.out.println("I am constructor");
    }// constructore
    public void eat(int age) {
        System.out.println("I am eat");
    }// constructor
    private void jump() {
        System.out.println("I am constructor");
    }// constructor
}


as observed throgh refelction it voilets the oops concept of encapsulation buy changeprivate filed fron outside and able to crete instance for singleton class outside 
so not suggestable for use although its not such neccesary we can achive all the behavious with our instance of class
and one more all these reflection process done in jvm soo it s performance is also slow
\








Annotations:






before going to start by mention annotations we are giving information to compiler to add additionchecks as per the mentioned annotation like of we metion @oveeride then compiler will check whether same method conatines conatines inmparent or not @Deprecated: if we decide to not to process further on a particulr method then memthion with annotation as @deprecated then whenevr if they trying to use this particuler method they are able to see warnings as it has been deprecated 
@Override: as we all aware of this to override methods in children classses we use this annotation  
@SupressWarnings: usually when we are using a method,class, which is not being processed further then we get deprecation warning message to avoid that we can use this annotation 
@FunctionInterface: it is used to let compiler know that its functional interface
@Savevarargs(heappollution): this is for solve heappollution issue usually when we assign object reference of one to another polllution may happen and to solve that this will be used, but showing compile time issue s is better to avoid get rid of runtime erros right.
instead of ising these kind of warnings and moving forward will cause failure in runtime

Meta-Anotations:these are the annoatations that tells where particular annotation will be used and some rules it will be over on anotation

@Target  (type:method,class,field,constructore) it defines where can we use particulr annotaion which is represented below to it
@Retention: it has (retentionPolicy:source) or class or runtime
source: mean sthe annotation will be appear in souce our souce java finl eonly once the copiler creates .class files it will not be there ,
class: here annotation willl be represented in .class file as well but not in runtime
run time:  here annotation will go till runtime as we see in reflection (then jvm )
@Documented: annoattions will be appeared in  geenrated  document 
@Inherited: here the if you mention tus annotation the annotation which are mentiong for parent will also be applicable for child as well
@Repeatable: here it say can we mention same annotation doublke or multipletimes before java8 it noyt possible after java 98 it is but here to do this we need two steps

to create annoattion 

@Repeatable(Categories.class); //this is the conatiner to store multiple category values
public @interface Category{
//custom annotation
String[] name(); //these type would be primitive,enum and string but should not pass args
int val();
}

public @interface Categories{
    Category[] val();
}
@Category(name:"swathi")
@Category(name:"rajesh")
@Category(name:"gopi")
public class Eagle{

}

@CustomAnotations

as inhave shown in above example we can create custom annoations and by provindg target and retention annotation we add some detial to thet where we use particular annotation and is it repeatable or not


Day-12: saturday

Excpetion handling:

// Exception:
// it is a piece of code it may cause to stop the excution of our code
// we can handle the exceptions
//we have two types of exceptions and have errors as well
// erros:
// loke jvm erros memory out of error (heap erro) and stack overflow error we cannot handle these 
// where as exceptions are bith two types:

// checked/compile time exceptions
// // unchecked/runtime exceptions
// // however

// checked exceptions are 
// object->Exception->thowable->(Runtimeand compiletime)
// 1) classNotFoundException
// here compiler does  force us to handle this while compilation itslef
//we should handle it by using try-catch or thro it to main call ti ll start of stack

// 2)run time exception 
// 1)arthimatiException
// 2)ClassCastException
// 3)IndexOutOFBoundexception(Arrayindexoutofbound,stringindexoutofbound)
// 4) nullpointerexception
// here compiler does not force us to handle these exceptions

//its runtime exception just throwing excpetion

import java.io.IOException;

public class ExceptionCheckCLass {
    // public static void main(String[] args) throws ClassNotFoundException {
     public static void main(String[] args){
        try {
            compiletime(0);
        } catch(IOException ie){
            System.out.println(ie);
        }catch (Exception e) {
            //if theyw ant to put some they can 
            // throw e;//it may again throw it to main caller if it throws from here the caller should throw again

            System.out.println(e);
            
        }
        // catch(IOException ie){
//this is not work here as all exception are handled above so move to up
        // }
          try {
            compiletime(0);
        } catch (Exception e) {
            //if theyw ant to put some they can 
            // throw e;//it may again throw it to main caller if it throws from here the caller should throw again

            System.out.println(e);
            
        }finally{
            //close any streams which are opened i can help you wjen you return from any of them try and catch but when systemgot shutdon and stack or memory erros occured or focrecifully stppped the excution i cannot help you in gthis to excute otherwise i do not have any restriction i ncan run
        }


        //try can use with just try and finally 
        runTime(0);
    }

    // compile time it thows error sas we not handling it
    private static void compiletime(int num) throws ClassNotFoundException ,IOException{
        if (num == 0) {
            throw new ClassNotFoundException();
        }

    }

    // it does not throwing any error as its runtimeerror
    private static void runTime(int num) throws NullPointerException {
        if (num == 0) {
            throw new NullPointerException();
        }
    }
}




Operators:

operator is a sign to perform operation on operands
operands : which are being performed in operation 


1) arithmatic operators (+,-,*,%,/)
2) relational operators (==,!=,<=,>=)
3)logical operators(&&,||,!) ! treadt as unary operator as well
4) assignment operators (=)
5)unary operators (++,--,!) single operand
6) bitwise operators (&&,||,!|,NOT)

for &-> if both are true then only true
for | -> if any on eof them true then it would be true
for ^ : ->if both are same then its false if eithe rone of them is diff then its true

~: it chnages from true to false
false to true


if we see 1 at MSB it teated as negative here

7)bitwise shift operators (signed left << ,signed left>> and unsigned right <<<,unsigned right  >>>)
here for singed left first we do 1s compliment then we cakculate usalually foir left its n*2 for right its n/2 
for unsigned left no diff same as signed left but where as in unsigned right once we shift to right have to take from above for msb as me moved right
this is case we should be keep in mid remaing is normal 

one thing for unsinged need to take 1s compilientn double times as need to do 2's compliment 
8)ternary operator:its mimc the for loop (a>b)? "hii":"heloo"
9)instance of type operator   parentclass obj=new chilclase();

 obj instanceOf(chilcclass)

 

 Day-13: sunday
control flow statements:
if,ifelse,nested if,if else ladder,while,do while and switch

topic2:
collection
collection is a part of collection framework,it is a interface where it expose multiple methods whch has been implemented by collection classes those are arraylist,queue,linkedlit,set



 where as collections: it is a class (utility) where it has all static methods to do operation on collection 
 like sort()
 reverse()

 import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CollectionEx{
    public static void main(String[] args) {
        
 List<Integer> li=new ArrayList<>();
 System.out.println(li.add(3));
 System.out.println( li.add(6));
  System.out.println(li.add(9));

  System.out.println(li.size());//3
  System.out.println(li.isEmpty());//false
  System.out.println(li.contains(5));//false
  System.out.println(li.add(5));
  System.out.println(li.contains(5));//true
  System.out.println(li.remove(3));//3rd index will be removed
  System.out.println(li.remove(Integer.valueOf(5)));//here now it will remove the value of particular indexd

 Stack<Integer> st=new Stack<>();
  System.out.println(st.addAll(li));//all values from li will be added to st
  System.out.println(st.remove(Integer.valueOf(2)));
  System.out.println(st.containsAll(li));
  System.out.println(st.removeAll(li));
  st.clear();
  System.out.println(st.isEmpty());
   /////collections
  Collections.sort(li);
    System.out.println(li);
     System.out.println(Collections.max(li));
    }
}



week 4:
Day-14


//queue first in first out
//queue is interface which are extended from collection interface
//it folows first in out but some exceptions like priorityqueue
import java.util.Arrays;
import java.util.Collections;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);// its by default sort them in ascending ordedr
        pq.add(5);
        pq.add(8);
        pq.add(3);
        pq.add(1);
        pq.add(9);
        System.out.println(pq);
        pq.isEmpty();
        // if we want to make pq in descending order need to provide custom comparator
        // pq.add to add elements in to the pq
        // pq.add(null)throws exception null pointer exception
        // offer also add elemtns into the pq it returns false if adding fails

        // poll()//retrives and remove the head of queeu return null if queue is empty
        // remove()//it throws exception no such element exception if queue empty

        // peek() //just remove first element from queue does not remove it
        // element is same peek if queue empt just return exception

        // iteratable-collection-queue-PriorityQueueEx
        // minPriorityQueue - min heap
        // maxPriorityQueue -max heap

        // add - O(logn)
        // peek-O(1)
        // remove-O(logn)
        // arbitary element -O(n)

        // primitive collection sort
        int[] arr = new int[] { 3, 5, 68, 9 };
        // comparator
        // comaprable compareTo
        Arrays.sort(arr);

        // object collection sorting

        // comparator (fnctional interface)
        // which abstarct method

        // Comparator

        Integer[] arr1 = { 4, 56, 7 };
        Arrays.sort(arr1, (a, b) -> b - a);// its by default sort them in ascending ordedr

        Arrays.sort(arr1);// comparable compare to

        // if a>b = 1 (swap happens)
        // a==b = 0
        // a<b =-1
        for (Integer val : arr1) {
            System.out.println(val);
        }
        Car[] cArray = new Car[3];
        cArray[0] = new Car("telsa");
        cArray[1] = new Car("porche");
        cArray[2] = new Car("hondai");
        Arrays.sort(cArray, (a, b) -> a.compareTo(b));// this compares and sorts in lexicograpahical order
    }

}

class Car implements Comparable<Car> {
    String carType;

    public Car(String type) {
        this.carType = type;
    }

    @Override
    public int compareTo(Car o) {
        // TODO Auto-generated method stub
        return this.carType.compareTo(o.carType);
    }
}

Java Queue and PriorityQueue Notes
Queue Interface

Queue is an interface that extends from Collection interface
Follows First In First Out (FIFO) principle
Some exceptions like PriorityQueue don't strictly follow FIFO

PriorityQueue

Default behavior: Sorts elements in ascending order (min heap)
Custom comparator: Can be used for descending order (max heap)

Key Methods
MethodDescriptionException Handlingadd()Adds elements to PQThrows exception if adding failsoffer()Adds elements to PQReturns false if adding failspoll()Retrieves and removes headReturns null if queue is emptyremove()Retrieves and removes headThrows NoSuchElementException if emptypeek()Just returns first elementReturns null if emptyelement()Same as peek()Throws exception if empty
Time Complexity

add: O(log n)
peek: O(1)
remove: O(log n)
arbitrary element search: O(n)

Important Notes

pq.add(null) throws NullPointerException
Min PriorityQueue = min heap
Max PriorityQueue = max heap

Hierarchy
Iterable → Collection → Queue → PriorityQueue
Sorting in Java
Primitive Arrays
javaint[] arr = {3, 5, 68, 9};
Arrays.sort(arr); // Uses natural ordering
Object Arrays
Using Comparator (Functional Interface)
javaInteger[] arr1 = {4, 56, 7};
Arrays.sort(arr1, (a, b) -> b - a); // Descending order
Arrays.sort(arr1); // Ascending order (uses Comparable)
Comparator Logic

If a > b → return positive (swap happens)
If a == b → return 0 (no swap)
If a < b → return negative (no swap)

Comparable Interface

Classes implement Comparable<T> interface
Must override compareTo() method
Used for natural ordering

Example Code Structure
java// PriorityQueue with custom comparator (descending order)
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

// String sorting (lexicographical order)
Arrays.sort(stringArray, (a, b) -> a.compareTo(b));

// Custom class implementing Comparable
class Car implements Comparable<Car> {
    String carType;
    
    @Override
    public int compareTo(Car other) {
        return this.carType.compareTo(other.carType);
    }
}





Day-15:
Dequeue-insert and delete from both ends
ArrayDeque:its array but extends queue so that from this we can insert and delete from biut ends of array basically we use this shilw implementing the stack or queue from array
List
Iterator-it implements iterable i intyerface it itterators over the collection ot has hasNext,next and remove
LinkedList: it implemets list and queue so that we can add elemnt from first and last and from index basis as well
Vector: same as arraylist but it thread safe
Satck:follows last in firt our order it also implements queue but its thread safe because for vector ans stack put lock on threads by using syncronised functional interface


Map: (very important)
map does not extends from collections here all the collections have unique values but in hashmap we have two one iskey abf value
 here in hashamo key are uniquee

 we have size()
 isEmpty()
 put()
 remove()
its a form of table underthehood like whle initilizaing if we metion  any size it takes that size otherwise it just take default size as 16
and for each cell conatins hash,key,val,node next 
 first whenevrr we try to insert like put the key into the map its first calculate the hash value fir that 
 and it does % with size the map default 16 then will get index in that index it append key and value and hash which we calculuted and key ,value from input.

 lets say if two or more keys get same index then it creases childrn linkedlist at particular index of  next  it points to  that  is nested linkedlist.
 it would be helppul innfurther processing while getting elements

 if linkedlist size grows there is a threeshold (loadfactor) if it reaches tjat loadfactor it simply converts linkedlist into treefy RBL trees binary search trees (AVL trees) this is the process happeing underthe hood
 for put
 let say when trying to a key from hash sae process uts again calculate the hash from that it calute mod same as before and checks whetehr tjat mainindex conatins the key which we need or not if not it checks whetehr the children linkedlist is there for that index or not if it does then it itterates ove r th elinkedi and cehcjs for the key whereas if it contains a Binary search its slight more easy to get elemnet or to search  as we eliminate half part of the tree as per key value
it also as a node next 
 Hashtable:
 so hashmap and table almost similar with minor differences those are hashmap not htread safe whereas hashtable are (syncronized put locks for threads) and hashtable does not allow null but in hashmap we can use null as key and value 
 and hashtable follows order but hashmap odes not
 
 time compleixty for hashmap: 
 put: avergae O(1) 
get:average O(1) worest case its O(n) if we have linked list if trr
search:O(1) worest caseits O(n) where as for binary search tree its O(logn)
remove():O(1) worest caseits O(n) where as for binary search tree its O(logn)


linkedhashmap:
it is similar to hashamap but it follows linkedit nature and contains extra two keys for before and after to maintian the before an dafter of particular node
while inserting it follow same process as hashmpa calculating hash and % of length of map to get index then once key is being added it updates the before and after  for that 
again this is not htread safe but explicltoy to make thread safe use utility class Collections.syncronizedMap(new LinkedList());

HashMap<Integer,String> map=new LinkedHashMap<>();

Treemap:
map-sortedmap-navigablemap-treemap

map<Integer> map=new TreeMap<>();

its is a node where its has left,parent,key,value,right
it uses RBL trees means RBL sorted array so it takses O(logn) averaga time complexity
for parnt node its parent is null 

it has few methods and it folows sorting oirder default as asceining and if we mention comparatore tjhen it follows that 
comparator

map.headmap(tokey) //exclusive
map.tailMap(fromkey) //inclusive
map.firstKey()
map.lastKey();


Java Collections Framework
Queue Implementations
ArrayDeque

Implementation of queue using an array
Allows insertion and deletion from both ends (double-ended queue)
Used for implementing both stack and queue data structures
Not thread-safe
Operations: addFirst(), addLast(), removeFirst(), removeLast()

LinkedList

Implements both List and Queue interfaces
Allows element insertion/deletion at both ends and at specific index positions
Double-ended queue capabilities with methods like addFirst(), addLast(), removeFirst(), removeLast()

Vector

Similar to ArrayList but thread-safe
Uses synchronized methods for thread safety
Generally slower than ArrayList due to synchronization overhead

Stack

Follows Last-In-First-Out (LIFO) order
Thread-safe (extends Vector)
Operations: push(), pop(), peek()

Iterator

Implements Iterable interface
Used to iterate over collections
Main methods: hasNext(), next(), remove()

Map Implementations
HashMap

Stores key-value pairs where keys must be unique
Does not extend from Collections framework (separate hierarchy)
Core operations: put(), get(), remove(), size(), isEmpty()

Internal Implementation:

Default initial capacity: 16 buckets
Uses array of buckets under the hood
Process for put() operation:

Calculates hash code of the key
Maps hash to array index using hash % array_length
Stores key-value pair at calculated index
Handles collisions using linked lists at each bucket



Collision Handling:

Initially uses linked lists for collision resolution
If linked list size exceeds threshold (load factor), converts to Red-Black Tree
Conversion to tree improves worst-case performance from O(n) to O(log n)

Performance:

Average case: O(1) for put/get/remove operations
Worst case: O(n) with linked lists, O(log n) with trees

Key Features:

Not thread-safe
Allows null keys and values
No guaranteed iteration order
HashMap Internal StructureImage HashTable

Similar to HashMap but with key differences:

Thread-safe (uses synchronized methods)
Does not allow null keys or values
Typically slower than HashMap due to synchronization
Has predictable iteration order (unlike HashMap)



LinkedHashMap

Extends HashMap with additional linked list structure
Maintains insertion order of elements
Contains extra references (before/after) for each entry to maintain order
Internal implementation:

Uses same hash calculation process as HashMap
Additionally maintains doubly-linked list to track insertion order
Updates before/after references when new entries are added



Making thread-safe:
javaMap<Integer, String> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap<>());
TreeMap

Implements SortedMap and NavigableMap interfaces
Stores entries in sorted order (natural ordering or custom Comparator)
Implemented using Red-Black Trees
Node structure: left child, parent, key, value, right child
For root node, parent is null

Performance:

All operations take O(log n) time
Guaranteed sorted iteration

Key methods:

headMap(toKey) - returns entries with keys less than toKey (exclusive)
tailMap(fromKey) - returns entries with keys greater than or equal to fromKey (inclusive)
firstKey() - returns the first (lowest) key
lastKey() - returns the last (highest) key







Day-16:
hashset almost similiar to the hashmap except one difference here in hashset we dont concentarte on value we will be having keys only while adding elemnt into the set it adds elemnt as key and value as dummy object so its similar to hashmap but concentareed on keys onlyyyyy 
hashset
linkedhashset
treeset everything similar to hashmap,linkedhashmapp and treemap



Stream:

we consider stream as a pipeline through our collection of data passess through
while data passing through pipelines, many intermediate operations can be performed on our data
it's useful whemn we have to process bulk data we can do parallel processing

here we have 3 steps to follow

1) create stream for our data
2) do intermediate operations on data (filter,map,sorted,distint) here we treat these operations are lazy operations because these are executed when terminal operation invoked
3) do terminal operations on data ( reduce,count,collect,) thses operation will trigger the stream means it closes the stream we cannot perform further processing on streatm after terminal operation
and one more thing we should chnage main input stream at the end we give output as new stream not inout stream

import java.util.stream.*;
import java.util.*;

public class StreamEx {
    public static void main(String[] args) {
        // from collection to stream
        List<Integer> li = Arrays.asList(5, 1, 2, 9, 5, 32, 3, 4);
        Stream<Integer> number = li.stream();
        System.out.println(number.filter((Integer num) -> num > 33).count());
        // from array to stream
        Integer[] arr = new Integer[] { 45, 678, 899 };
        Stream<Integer> streaData = Arrays.stream(arr);
        streaData.map((Integer num) -> num * 9)
                .forEach((Integer n) -> System.out.println(n));
        List<Integer> fiResult = Arrays.stream(arr).map((Integer num) -> num * 0)
                .peek((Integer n) -> System.out.println(n)).collect(Collectors.toList());
        System.out.println("wooo" + fiResult);

        // from static method

        Stream<Integer> streamData = Stream.of(3, 4, 5, 7, 8, 9, 8);
        // from streambuilder
        Stream.Builder<Integer> streamData1 = Stream.builder();
        streamData1.add(9);
        streamData1.add(5);
        streamData1.add(3);

        // from stream iterate

        Stream<Integer> streamDataIt = Stream.iterate(100, ((Integer num) -> num + 100)).limit(9);
        // flatmap
        String[][] list = new String[][] { { "B", "a", "A", "hiii", "hello", "hdbfhdkgaekg", "asdjkfnhaslfhdf" },
                { "hiii" },
                { "sam" } };

        System.out.println(Arrays.stream(list)
                .flatMap((sentence) -> Arrays.stream(sentence)).sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toSet()));
        // System.out.println(st);

        // peek

        System.out.println(Arrays.stream(list).map((st) -> Arrays.stream(st))
                .collect(Collectors.toSet()));
    }
}
//we have similiar intermediate and terminal function to playu with them and can do parallel processing as well to reduce the time of execution by using fork-join-pool technique in gthis algorthim they use to reduce the task into small chucks till possible and then do processing on small chuck and hthen combine the result  intsead of doing procsseing on one by one 
//once we perform any operation on stream data then we cannot perform on that seperately we can take resilt of first processed one and do operations on that otherwise take from main stream.
