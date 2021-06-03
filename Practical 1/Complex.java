import java.util.Scanner;

public class Complex {
    int x, y;
    void setValue(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Set values in order (real, imaginary) : ");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    public String toString(){
        return ( x + " + "+y + "i");
    }

    public static Complex add(Complex a, Complex b){
        Complex sum= new Complex();
        sum.x= a.x + b.x;
        sum.y= a.y + b.y;
        return sum;
    }
    public static Complex multiply(Complex a, Complex b){
        Complex prod= new Complex();
        prod.x= (a.x)*(b.x)- (a.y)*(b.y);
        prod.y= (a.y)*(b.x)+ (b.y)*(a.x);
        return prod;
    }
    public static void main(String args[]){
        Complex num1 = new Complex();
        Complex num2 = new Complex();
        num1.setValue();
        num2.setValue();

        Complex sum;
        Complex prod;

        sum=Complex.add(num1, num2);
        System.out.print("The sum is : ");
        System.out.println(sum.toString());

        prod= multiply(num1, num2);
        System.out.print("The product is : ");
        System.out.print(prod.toString());
    }
}
