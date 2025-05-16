//functional interface represent which interface conatins only on absgtarct method
//so that we can use @functioninterface as well but not neccesary
//however if we use annotation if anotation when you trying to reation one more method it throes error as it strict functional interface
//if we represent functioninterface withoit ,entioning anoatation we can add methods then that should not be considered as functional interface

// ///functinal interface
// public interface FunctionalInterface_1 {
//      public void fly();
// }

//functinal interface
@FunctionalInterface
public interface FunctionalInterfaceEx {
     public void fly();
     public String toString();
     // public void eat();//cannot create more than one abstarct method
}

// implementaion
