package P2;
import P1.TwoDim;

public class ThreeDim extends TwoDim {
    private int z;

    public ThreeDim() {
    }

    public ThreeDim(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    public String toString(){
        return (super.toString()+","+ z);
    }
}