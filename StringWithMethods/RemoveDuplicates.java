
public class RemoveDuplicates {
public static void main(String[] args) {
	String str="java is a Robust";
	String str1="";
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(str.indexOf(c)==str.indexOf(c)) {
			str1=str.replace(c, ' ');
		}
	}
	System.out.println(str1);
}
}
