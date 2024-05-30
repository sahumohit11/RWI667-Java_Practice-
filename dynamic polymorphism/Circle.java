class Circle extends Shape{
private double radius=0.0;

public Circle(){
}
public Circle(double radius){
this.radius=radius;
}
public Circle(int borderWidth,String color){
     super(borderWidth,color);
}
public Circle(int borderWidth,String color,double radius){
     super(borderWidth,color);
     this.radius=radius;
}

public void setRadius(double radius){
 this.radius=radius;
}
public double getRadius(){
 return radius;
}
@Override
public double area(){
System.out.println("circle");
 return 3.1415*radius*radius;
}
public double circumference(){
System.out.println("circle");
 return 2*3.1415*radius;
}
}