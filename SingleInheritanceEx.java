class Shape{

private int size=0;
public void setSize(int size){
this.size=size;
}
public int getSize(){
return size;
}
}

class Circle extends Shape{

private int rad=0;
public void setRad(int rad){
this.rad=rad;
}
public int getRad(){
return rad;
}
}
public class SingleInheritanceEx{
public static void main(String[]args){
Shape s=new Shape();
Circle c=new Circle();
c.setSize(12);
c.setRad(44);
System.out.println(c.getSize());
System.out.println(c.getRad());

}
 }