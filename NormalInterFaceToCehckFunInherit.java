// public interface NormalInterFaceToCehckFunInherit extends FunctionalInterfaceEx{
    
// }
//this is okay no restrction we can inherit from function interfaces
@FunctionalInterface
public interface NormalInterFaceToCehckFunInherit extends FunctionalInterfaceEx{
    public void fly();//if same function conatins in parent function interface totallly fine but if we have diff function in child then i would not be work becuase every functioninterface should have only one abstact method
    // public void eat();//here it thors error
}