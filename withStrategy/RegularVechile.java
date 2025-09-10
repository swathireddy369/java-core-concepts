public class RegularVechile extends Vechile {
    RegularVechile() {
        super(new RegularDriveStrategy());
    }
}