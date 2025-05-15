public interface Bird {//access modifier should be public 
    public void canBreath();//abstarct method access specifier should be public as need to provide implementation
    public void fly();//abstarct method
    public static final int a=3000;
     default void walk(){
        System.out.println("i am default from java8 you can use me and override me i am happy to but only when my parent is implemneted  y you");
     }
     static void run(){
        System.out.println("hey i am elgible in interface from wjava8 itself so use me but as i am static you cannot override me but use me if you want by mention ing my parent name before calling me and i am only elgible in static methodssssss so many restrictions and i can access static member sofrom my parent ");
     }
     //java9

//      private void cook() {
//      System.out.println("hey i was born in java9 soo please use me in my parent itslef if default has many repated code and many defaul have same code then use me to avoid duplication and i will increse readlibility and reusability and i will also use static methods if any i need");
//      }
// private static void drink(){
//       System.out.println("hey i was born in java9 soo please use me in my parent but obly in static methods as you aleady know");
    
// }
public interface InnerBird {
  default void innerwalk(){
        System.out.println("i am default from java8 you can use me and override me i am happy to but only when my parent is implemneted  y you");
     }
     static void innerrun(){
        System.out.println("hey i am elgible in interface from wjava8 itself so use me but as i am static you cannot override me but use me if you want by mention ing my parent name before calling me and i am only elgible in static methodssssss so many restrictions and i can access static member sofrom my parent ");
     }
}
}
