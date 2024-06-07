
public class Pallindrome {
public static void main(String[] args) {
	 String str="nayan";
	 String s1="";
	 
	 for(int i=0;i<str.length();i++) {
		 char ch=str.charAt(i);
		 s1=ch+s1;
		 System.out.println(s1);
	 }
	 if(s1.equals(s1)) {
		 System.out.println("String is pallindrome");
	 }
	 else {
		 {
			 System.out.println("String is  not pallindrome");
		 }
	 }
}
}
