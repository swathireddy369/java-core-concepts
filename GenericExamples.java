// simple class:
// public class GenericExamples {
//     public static void main(String args[]) {
//         check obj = new check();
//         System.out.println(obj.getValObject());
//         obj.assign("swathi");
//     }

// }
//Genric class

class check<T> {
    T ob;

    public void assign(T ob) {
        System.out.println(ob);
    }

    public T getValObject() {
        return ob;
    }
}
//generic subclass
class sub<T> extends check<T>{}
//non generic subclass
class sub1 extends check<Integer>{}

//mutiple paramers for geenric class

class multiple<T,k> {
     private T key;
     private k val;

    public void assign(T key,k val) {
         System.out.println(key+""+val);
    }

    // public T getValObject() {
    //     return key;
    // }
    // public k getValObject1() {
    //     return val;
    // }
}

//
// generic method
class check2 {
    public <T> void assign(T ob) {
        System.out.println(ob);
    }
}
//inheritance 
// class parent<T extends check>{

// }
//upper bound
class upper<T extends Number>{

}
//multibound 
//upper bound
class multibound<T extends Number,inf1,inf2>{

}

// /wild card/

// public void method1(List<T> val1, List<K> val2){

// }
// public  <T> void method1(List<T> val1){

// }
// here for wild card method we can havae diff ptype for each and ever param and can suppor lower bound as well where as in generic method lower bound does not support with single type cannot get mutliple types so need to ahem multi genric for mutiple types 

//erase after compiling while coveritng into byte code thi sgerics types will be earsed and replaed as object all types
//for raw type we doed not mtnion any type simple pass values

//unbound   
 class sub3{
public <T> void setvashe(){
//here unboudn on ecan pass any type 
}
}

public class GenericExamples {
    public static void main(String args[]) {
        // check obj = new check();
        // System.out.println(obj.getValObject());
        // obj.assign("swathi");
         check<Integer> obj = new check<>();
          obj.assign(3);
        // obj.assign("swathi");//this is not work 

        ///genrice sub class
       sub<Integer> st=new sub<>();
       st.getValObject();
          ///genrice sub class
       sub sb1=new sub();
       sb1.getValObject();
       
        multiple<Integer,String> obj4=new multiple<>();
        obj4.assign(1,"swathi");

  check2 gm=new check2();//generic methid
  gm.assign(4);
  
//   parent<check> p1=new parent<>(obj);
  upper<Integer> u=new upper();

    }
}
