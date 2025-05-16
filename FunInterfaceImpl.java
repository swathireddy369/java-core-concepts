public class FunInterfaceImpl {
    public static void main(String[] args) {
        // regular implementing of functional interface
        FunctionalInterfaceEx fObj = new ImpCheck();
        fObj.fly();
        // using anonymous function functional interface inplementation
        FunctionalInterfaceEx fobj1 = new FunctionalInterfaceEx() {
            @Override
            public void fly() {
                System.out.println("this is anonymous implemenation");
            }
        };
        fobj1.fly();
        // using lambda
        FunctionalInterfaceEx fobj2 = () -> {
            System.out.println("this is lambda implemenation");
        };
        fobj2.fly();
      //////////////////////consumer
      /// 
      Consumer<Integer> cobj=(Integer val)->{
      System.out.println("i am consumer so i wont give any oiutout");
      };
      cobj.fly(1);
      Supplier<Integer> sobj=()->{
      System.out.println("i am producer so i wont take any input but i will give output");
      return 1;
      };
      sobj.fly();
       Function<Integer,String> fobj=(Integer val)->{
      System.out.println("i am Functiontype so i wile take one input and but i will give output");
      return "1";
      };
      fobj.fly(3);
      Predicate<Integer> Pobj=(Integer val)->{
      System.out.println("i am predicte so i will take any input but i will give boolean");
      return true;
      };
      Pobj.fly(3);
    }
}

class ImpCheck implements FunctionalInterfaceEx {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("this is regular implemenation");
    }

}

// lambda expression main usage is to implement functional interfaces to
// minimize the code of mentioning method name and not even like anonymous class

// here we have multiple types of functional interfaces:

// consumer:
// public interface Consumer<T> {
// public void fly(T t);//only input no result
// }

// supplier
// public interface Supplier<T> {
// public T fly();//only result no input
// }
