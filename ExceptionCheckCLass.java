// Exception:
// it is a piece of code it may cause to stop the excution of our code
// we can handle the exceptions
//we have two types of exceptions and have errors as well
// erros:
// loke jvm erros memory out of error (heap erro) and stack overflow error we cannot handle these 
// where as exceptions are bith two types:

// checked/compile time exceptions
// // unchecked/runtime exceptions
// // however

// checked exceptions are 
// object->Exception->thowable->(Runtimeand compiletime)
// 1) classNotFoundException
// here compiler does  force us to handle this while compilation itslef
//we should handle it by using try-catch or thro it to main call ti ll start of stack

// 2)run time exception 
// 1)arthimatiException
// 2)ClassCastException
// 3)IndexOutOFBoundexception(Arrayindexoutofbound,stringindexoutofbound)
// 4) nullpointerexception
// here compiler does not force us to handle these exceptions

//its runtime exception just throwing excpetion

import java.io.IOException;

public class ExceptionCheckCLass {
    // public static void main(String[] args) throws ClassNotFoundException {
     public static void main(String[] args){
        try {
            compiletime(0);
        } catch(IOException ie){
            System.out.println(ie);
        }catch (Exception e) {
            //if theyw ant to put some they can 
            // throw e;//it may again throw it to main caller if it throws from here the caller should throw again

            System.out.println(e);
            
        }
        // catch(IOException ie){
//this is not work here as all exception are handled above so move to up
        // }
          try {
            compiletime(0);
        } catch (Exception e) {
            //if theyw ant to put some they can 
            // throw e;//it may again throw it to main caller if it throws from here the caller should throw again

            System.out.println(e);
            
        }finally{
            //close any streams which are opened i can help you wjen you return from any of them try and catch but when systemgot shutdon and stack or memory erros occured or focrecifully stppped the excution i cannot help you in gthis to excute otherwise i do not have any restriction i ncan run
        }


        //try can use with just try and finally 
        runTime(0);
    }

    // compile time it thows error sas we not handling it
    private static void compiletime(int num) throws ClassNotFoundException ,IOException{
        if (num == 0) {
            throw new ClassNotFoundException();
        }

    }

    // it does not throwing any error as its runtimeerror
    private static void runTime(int num) throws NullPointerException {
        if (num == 0) {
            throw new NullPointerException();
        }
    }
}
