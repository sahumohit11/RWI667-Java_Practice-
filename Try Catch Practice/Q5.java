public class Q5{
 public static void main(String[]args){

try{
int arr[]=new int [5];
arr[10]=20;
/*for(int i=0;i<arr.length;i++){
	arr[i]=Integer.parseInt(args[i]);
}
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}*/
}
catch(ArrayIndexOutOfBoundsException aeioobe){
	System.out.println(aeioobe);
}

}
 }