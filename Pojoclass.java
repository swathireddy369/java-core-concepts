// pojo class is a plain old java object
//this class should be conatins public access modifier
//it coantins variables and its getter and setter methods
//it can be extend or implement  any other classes adn interface
//it has public default constructor
//no annoation should be used like @entity

// its a simple class
//use case mainly in two cases

// 1)when we get data from client like {id,name and address} in server we need to use this variabels values in few classes but there the variable name would be different to avoid this conflict we can use pojo to map varible names which we are receing from cliend and to the names where we are going to use in server
// in simple it works as a mapping class in my words

// 2) as we know that we have a flow of controller,server,repo, then pojo (we create objects entityobjects)

//Enum

//enum is a type of class where we have collection of constants
//and it allowcaste all constant values v=for it starting from 0 and can access those values by ordinals()
//we can define constants for java by using static final as well but why enumcam into picture let see
//enum should has type as enum it can not extend another classs as by default it implicity extends from java.lang.enumclass class 
//it can implement interfaces
//it can have variables,construtor an methods
//it can have abstarct method but if it does then all constants in enum shoudl provide implementaion to it
//it construtor should has private access specifier even if default constructer is become privte while converting it to bytecode
//no other class cannot extend these enum classes
//no need of instance creation
//as construtor is private so can noot create instance for it

//Final

public final class Pojoclass {
    public static void main(String args[]) {
        System.out.println("hi");
        for (EnumSample enums : EnumSample.values()) {
            System.out.println(enums);// values
            System.out.println(enums.ordinal());
            System.out.println(enums.name());
            System.out.println(EnumSample.valueOf("MONDAY"));
            System.out.println(enums.toLowerCase(enums.name()));
            System.out.println(enums.specialAboutMyDay());
            System.out.println(enums.isWeekend(enums));// here advatnge of enum over static final is we cannot give or
                                                       // pass over the range value or not avialbe values like false
                                                       // case vlaues because as we should pass enumhere
            // in staic final thats not the case so we dont know whetehr the method handling
            // false cases properly or not so that using enums is safer then satis final
            System.out.println("============================");// values

        }
    }
}
// class sub extends Pojoclass{//it throws error as we cannot extends final
// classes
// public void add(){

// }
// }