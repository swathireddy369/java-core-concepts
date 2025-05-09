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