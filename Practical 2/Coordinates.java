package P;
import P1.TwoDim;
import P2.ThreeDim;
public class Coordinates {
    public static void main(String[] args){
        TwoDim obj1= new TwoDim(1,2);
        ThreeDim obj2 = new ThreeDim(3,4,5);
        
	System.out.println("Two dimensional version : ");
        System.out.println(obj1.toString());
        
	System.out.println("Three dimensional version : ");
        System.out.println(obj2.toString());
    }
}