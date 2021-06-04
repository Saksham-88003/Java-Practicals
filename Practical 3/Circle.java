package P3;
import P1.Shape;

import java.util.Scanner;

public class Circle extends Shape {
    public float r;
    public void setData(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Radius :");
        r=sc.nextFloat();
        sc.close();
    }
    public void displayArea(){
        System.out.println("Area = "+(3.14*r) +" sq. units");
    }
    public void readData(){
        System.out.println("Radius = "+ r+ " units");
    }

}
