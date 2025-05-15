import java.util.ArrayList;
import java.util.List;
// Eager initilization

import java.util.ArrayList;

public class SingleTonClass {
    private static SingleTonClass db = new SingleTonClass();// no one can use from outside

    private SingleTonClass() {

    }

    public static SingleTonClass getInstance() {
        return db;
    }
}
// here ,memory wasteage will be there if no body use this instance

// lazy
class Lazy {
    private static Lazy db; // no one can use from outside

    private Lazy() {

    }

    public static Lazy getInstance() {
        if (db == null) {
            db = new Lazy();// lazy
        }
        return db;
    }
}
// but here if two threads execute then two instances will be created
// again memory wasteage

class sync {
    private static sync db; // no one can use from outside

    private sync() {
    }

    synchronized public static sync getInstance() {// if two threads come to execute at a time thois sync meyhod will
                                                   // allows one thread at a time then it allows next one by locking and
                                                   // unlocking the hthread so it takes time to do and slow progress
                                                   // becaus eof lockinga nd unlocking
        if (db == null) {
            db = new sync();// lazy
        }
        return db;
    }
}

class DoubleCheck {
    private static DoubleCheck db; // no one can use from outside

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {// if two threads come to execute at a time thois sync meyhod will allows
                                             // one thread at a time then it allows next one by locking and unlocking
                                             // the hthread so it takes time to do and slow progress becaus eof lockinga
                                             // nd unlocking
        if (db == null) {
            synchronized (DoubleCheck.class) {
                if (db == null) {
db=new DoubleCheck();
                }
            }
        }
        db = new DoubleCheck();// lazy
        return db;
    }
}

//here double check performs before creating new object here also as we update our object in cache where those two core cahces are not in sync then double memory allocation would be happen
// so by using volatile we can avoid this issue due to that if we mention volatile b=while defining object it stores in memory not in ncache so duplication will be happen
// but performace will belittle bit show as we use memory over cache

// to avoid this bill pubh approach cam into pictue:

// where it uses eager approach but in some different approach by avoidng memory wastage

class Billpubh{
    private Billpubh(){

    }
    public static class SubClass{
     private static final Billpubh obj=new Billpubh();
    }
    public static Billpubh getInstance(){
        return SubClass.obj;
    } 
}
// here no memory wastage no slow progress because the nested class will be loaded only when it is referenced or used 


// the best singleton class is volatile repsresnetaion of object and Billpubh



// and ENUM:
//  public  enum Sample3{
//     // by default enum construtor is private 
//     // jvm makes it private by default for each jvm there will be one single constructire created which is private

//  }


 //Immutable class

 //the class cannot be changesed means class is defiend as final and its cannot be inherited 
 //its variabels should be final so that only consyrutor can inilize it no one can
 //as its defineda sfinal cannnot be mutated
 //it should not conatins setter as we donot chnage values 
 //can have getter methods

  final class sample2{
  private final int id;
  private final ArrayList<Integer> li;
  public sample2(int id,ArrayList<Integer> li){
    this.id=id;
    this.li=li;
  }
  public Integer getId(){
    return id;
  }

 public List<Integer> getLsuList(){
    return new ArrayList<>(li);
  }
 }