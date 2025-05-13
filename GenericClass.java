//Generic Class

class A {
    Object obj;
    public Object print(Object obj){
        return obj;//getting
    }
    public void set(Object obj){
        this.obj=obj;//setting
    }
}


class B<T> {//single generic class
    public T print(T val){
        return val;//getting
    }
}
class C<T,K> { //multiple geneic class
    public void print(T val,K val2){
       //getting
    }
}
class D<J> extends C<Integer,String> { //if childis generic
    public Integer print(J val){
       //getting
       System.out.println(val);
       return val;
    }
}
//what if we have not generic child class should get generic type from parent

class E extends D<Integer>{
 public Integer print(Integer val){
       //getting
        System.out.println(val);
        return val;
    }
}

class F {
 public <T> void print(Integer val){
       //getting
        System.out.println(val);
    }
}
public class GenericClass{
    public static void main(String args[]){
        A aobj=new A();
        System.out.println(aobj.print("swathi"));
          B<Integer> aobj1=new B<>();
        System.out.println(aobj1.print(1));
         D<Integer> aobj2=new D<>();
        System.out.println(aobj2.print(1));
           F aobj3=new F();
        System.out.println(aobj3.print(1));
    }
}