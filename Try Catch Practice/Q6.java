public class Q6{
 public static void main(String[]args){

try{
String str="helloWorld";
char c=str.charAt(-1);
}
catch(StringIndexOutOfBoundsException sioobe){
	System.out.println(sioobe);
}

}
 }