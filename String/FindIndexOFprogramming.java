
public class FindIndexOFprogramming {
public static void main(String[] args) {
	
	String str="Java is a high level object oriented programming language";
	String str1="";
	String find="programming";
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch!=' ') {
			str1+=ch;
		}
		else if(str1.equals(find)) {
			System.out.println("the index of programming is := "+(i-find.length()));
		}
		else {
			str1="";
		}
	}
	System.out.println(str.indexOf("programming"));
}
}
