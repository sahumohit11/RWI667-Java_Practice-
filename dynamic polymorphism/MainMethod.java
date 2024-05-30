public class MainMethod{
 public static void main(String[]args){
/*
Shape s=new Shape();
Circle c=new Circle(2.5);
Circle c1=new Circle(111,"cir const");
Circle c2=new Circle(211,"cir const 3",6.1);
c.setBorderWidth(20);
c.setColor("violet");
c.setRadius(2.4);
System.out.println(c.getBorderWidth());
System.out.println(c.getColor());
System.out.println("radius: "+c.getRadius());
System.out.println(c1.getBorderWidth());
System.out.println(c1.getColor());
System.out.println("circle area"+c.area());
System.out.println("circle area"+c2.area());

Shape sc=new Circle(3);
System.out.println(sc.area());
*/
Shape ss=new Square(4);
ss.setBorderWidth(1);
System.out.println(ss.getBorderWidth());
System.out.println(ss.area());
System.out.println(ss.perimeter());

}
 }