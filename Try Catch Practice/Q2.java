public class Q2{
 public static void main(String[]args){

try{
String a=args[0];
String b=args[1];

System.out.println(a);
System.out.println(b);
}
catch(ArrayIndexOutOfBoundsException aeioob){
	System.out.println(aeioob);
}




}
}