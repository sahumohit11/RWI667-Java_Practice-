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
class Triangle extends Shape{
private int len=0;
public void setLen(int len){
this.len=len;
}
public int getLen(){
return len;
}
}
public class HierarchicalInheritanceEx{
public static void main(String[]args){

Triangle t=new Triangle();
Circle c=new Circle();
c.setRad(99);
c.setSize(777);
t.setSize(12);
t.setLen(1111);
System.out.println("circle set  "+c.getSize());
System.out.println("triangle "+t.getSize());
System.out.println(c.getRad());
System.out.println(t.getLen());


}
 }