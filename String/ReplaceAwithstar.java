
public class ReplaceAwithstar {
public static void main(String[] args) {
	
	String str="Java is a high level object oriented programming language";
	String str1="";
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a') {
			str1=str1+'*';
		}
		else {
			str1+=ch;
		}
	}
	System.out.println(str1);
}
}
