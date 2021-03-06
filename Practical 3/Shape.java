//Question 3) Define an abstract class Shape in package P1. Inherit two more classes: Rectangle in package
//            P2 and Circle in package P3. Write a program to ask the user for the type of shape and then
//            using the concept of dynamic method dispatch, display the area of the appropriate subclass.
//            Also write appropriate methods to read the data. The main() function should not be in any
//            package.

package P1;
public abstract class Shape {
    public abstract void setData();
    public abstract void displayArea();
    public abstract void readData();
}
