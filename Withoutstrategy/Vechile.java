public interface Vechile extends vechileStrategy {
    private vechileStrategy vc;

    public void Vechile(vechileStrategy vc1){
this.vc=vc1;
    }
}