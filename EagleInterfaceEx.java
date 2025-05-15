//default access s specer wou;d be public for interface and abstact methods as well it should be public till java 8
//interface nothing but a system where two systems connect each other without knowing eachother
//abstarct method should be impleted by classes hwere interefece implements
//variabels should be static final constants
//we have nested interface concept as well 

// interface can conatin interface in it and class also conatin interface in it where as when a class can implemnetparante and child interface by mention ing parent interface 
// if a class inplement parent interface then class can be accessble for both parent and child methods to calss or overird 
//same but if implement child then nonly able to use child methods
//if a class conatins interface it can be implemted by using classnams=.
//in java8 we have defualt and static methods as well
//becuase in inheritance if interface where if i add any new abstract method in interface i shoudl add implementation for that method in all class where it has beei implemented so to avoid that issue java 8 version devcided to provide default method and its implemtaion in interface itself so while imolenting concrete class can provide impletenation or not where as for abtsract methods concere class should provide but abstarct class shoudnot its optional
//so that but the classes can access this default method (package specifi) access in class 
///if theuy want to override they can
/// coming to static as name suggest it shoud not overrid but it can be accessble in classes byt mention interface and impleting interface
/// in abstacr class well
/// next in java 9 rrelased private and private static so that that private methods cannot beaccesssed outside the interface so cannot provide any implemanetion ofr but it acan access in interface default and static methods so 
/// althoght static methoda can acess static members only whereas not static methods can access static and non static as well
/// and we cannot try to modify access specifiefo f method while overriding
public class EagleInterfaceEx {
public static void main(String args[]){
    // we cannot create object for interface
 Bird b=new check();
 b.canBreath();//in run time it will decide which method should call because single interface can be implemented my many cllasses
 b.fly();
 b.walk();
 ChildCheck ch=new ChildCheck();
 ch.fly();
 ch.cook();
}
}

 class check implements Bird{
//it shpuld implement all methods of interface
   
 @Override
    public void canBreath() {
         System.out.println(Bird.a);//constant from interface
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'canBreath'");
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    @Override
    public void walk(){
 System.out.println("default overried");
    }
//     @Override
//     public void run(){
// System.out.println("jo");
//     }//cannot be done as its static from parent

//inner 
// public void innerrun(){
//     System.out.println("yeah by imlenting parent interface onky am able to use child interface nmethods as well super");
// }
// @Override
// public void innerwalk(){
//     System.out.println("yeah by imlenting parent interface onky am able to use child interface nmethods as well super");
// }
// @Override
// public void innerrun(){
//     System.out.println("yeah by imlenting parent interface onky am able to use child interface nmethods as well super");
// }
//let try to impleemt child as well
//hey i am not able use parent one when i implement child  ,child is selfishhhhhh 

//nested interface in class
public interface InnerEagleInterfaceEx {
    public void fly();
     default void cook(){
        System.out.println("nested from class stilll i have allllll features am i not great");
     }
}

}
class ChildCheck implements check.InnerEagleInterfaceEx{
//from class nested interface superoo super
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    @Override
    public void cook(){
System.out.println("i am not sure whch access modifes i am let me check");
    }

}