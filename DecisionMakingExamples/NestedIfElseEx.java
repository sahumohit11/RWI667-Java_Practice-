public class NestedIfElseEx{
 public static void main(String[]args){

int a=60;
int b=40;
int c=30;

if(a>b){
 if(a>c){
	System.out.println("A is greatest");
 }
 else{
	System.out.println("A is greatest");
 }
}
else if(b>c){
	System.out.println("B is greatest");
}
else{
System.out.println("C is greatest");
}

}
}