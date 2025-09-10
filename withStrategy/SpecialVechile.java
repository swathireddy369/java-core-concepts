public class SpecialVechile extends Vechile {
    // here and goods vechile has code duplicacy
    SpecialVechile() {
        super(new SpecialDriveStrategy());
    }
}