
public class ToggleCase {
public static void main(String[] args) {
	String str="Java Is A high level Object oriented Programming language";
	String str1="";
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>=65&&ch<=90) {
			ch+=32;
			str1+=ch;
		}
		else {
			ch-=32;
			str1+=ch;
		}
	}
	System.out.println(str1);
}
}
