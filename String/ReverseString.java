
public class ReverseString {
public static void main(String[] args) {
	
	String str="Java is a high level object oriented programming language";
	String str1="";
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		str1=ch+str1;
	}
	System.out.println(str1);
}
}
