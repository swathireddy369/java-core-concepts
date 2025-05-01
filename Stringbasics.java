public class Stringbasics{
    public static void main(String a[]){
        String s1="hello"; //here it goes inside string constant pool which is present in the heap
        String s2="hello";//here it checks weather string constpool conatns "hello" or not if conatins just pointing to that otherwise create new string in pool
        if(s1.equals(s2)){
            //it checks its content is equal or not
        }
        if(s1 == s2){
            //it checks weather its reference is equal or not
        }
        String s3=new String("hello"); // as we mention new it creates new string constant pool in heap memory
        if( s1 == s3)//flase as they both references are not equal
        if(s3.equals(s3));//it checks its content
    }

    //string literals are nothing but string contents in string constant pool
    //as we create one string first as "hello" if we update that it creates new string constnt in pool so in this purpose it treated as immutable
}