public interface Vechile extends vechileStrategy {
    public final vechileStrategy vs;

    public void Vechile(vechileStrategy vc1){
this.vc=vc1;
    }
}