
public interface InnerInterfaceDetails {
    public String profession();
}

class Student implements InnerInterfaceDetails{
    @Override
    public String profession() {
        // TODO Auto-generated method stub
        return "Masters";
           }
}
 class Employee implements InnerInterfaceDetails{

    @Override
    public String profession() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'profession'");
        return "Software Engineer";
    }
    
 }

 //here four possible ways to create object

 InnerInterfaceDetails infoObj1=new Employee();//parent object referening to child class
 InnerInterfaceDetails infoObj2=new Student();//parent object refering to child object
 Student s1=new Student();//childclass obj to child class
 Employee e1=new Employee(); //childclass obj to child class