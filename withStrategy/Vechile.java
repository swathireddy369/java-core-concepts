public class Vechile implements VechileStrategy {
    VechileStrategy vs;

    Vechile(VechileStrategy vs) {
        this.vs = vs;
    }

    public void drive() {
        vs.drive();
    }
}