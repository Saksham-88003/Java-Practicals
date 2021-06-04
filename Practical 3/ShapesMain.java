import P1.Shape;
import P2.Rectangle;
import P3.Circle;

import java.util.Scanner;

public class ShapesMain {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    while (true){
        System.out.print("Enter Shape Type (1 - rectangle , 2 - circle):");
        int input= sc.nextInt();
        if(input==1){
            Shape obj1= new Rectangle();
            obj1.setData();
            obj1.readData();
            obj1.displayArea();
            break;
        }
        if(input==2){
            Shape obj2= new Circle();
            obj2.setData();
            obj2.readData();
            obj2.displayArea();
            break;
        }
    }
    }
}
