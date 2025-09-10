public class Main {
    public static void main(String args[]) {
        Vechile gv = new GoodsVechile();
        gv.drive();
        Vechile rv = new RegularVechile();
        rv.drive();
        Vechile sv = new SpecialVechile();
        sv.drive();
    }
}