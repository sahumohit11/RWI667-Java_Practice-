
public class ReverseString {
public static void main(String[] args) {
	String str="java is a portable language";
	String s1="";
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		s1=ch+s1;
	}
	System.out.println(s1);
	
}
}
