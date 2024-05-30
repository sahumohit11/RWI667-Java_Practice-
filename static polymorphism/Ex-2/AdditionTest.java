class Addition{
public int addition(int n1,int n2){
 return n1+n2;

}
public int addition(int n1,int n2,int n3){
 return n1+n2+n3;
}
public float addition(float n1,float n2){
 return n1+n2;
}
public float addition(float n1,float n2,float n3){
 return n1+n2+n3;
}
}
public class AdditionTest{
 public static void main(String[]args){
 Addition a=new Addition();

System.out.println(a.addition(3,4));
System.out.println(a.addition(3,4,5));
System.out.println(a.addition(3.3f,4.9f));
System.out.println(a.addition(3.33f,4.67f,6.2f));
}
}