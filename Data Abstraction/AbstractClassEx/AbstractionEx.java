abstract class Shape{
private int x;
public Shape(){
this.x=12;
System.out.println("Shape");
System.out.println("the value of x: "+x);
}
}
class Car extends Shape{
public Car(){
System.out.println("Car child");
}
}
public class AbstractionEx{
public static void main(String[]args){

Shape s=new Car();
}
 }