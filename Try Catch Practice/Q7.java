class Shape{
public int a=10;
}
class Circle{
public int a=20;
}
public class Q7{
 public static void main(String[]args){
 Shape s=new Shape();
try{

Circle c=(Circle)s;
}
catch(ClassCastException cce){
	System.out.println(cce);
}

}
 }