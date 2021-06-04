package P2;
import P1.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    public float l, b;
    public void setData(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Length and Breadth :");
        l=sc.nextFloat();
        b=sc.nextFloat();
        sc.close();
    }
    public void displayArea(){
        System.out.println("Area = "+(l*b) +" sq. units");
    }
    public void readData(){
        System.out.println("Lenght = "+ l+ " units");
        System.out.println("Breadth = "+ b+ " units");
    }
}
