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
