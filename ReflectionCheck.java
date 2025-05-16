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
