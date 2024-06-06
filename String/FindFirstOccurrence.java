
public class FindFirstOccurrence {
public static void main(String[] args) {
	
	String str="Java is a high level object oriented programming language";
	char find ='a';

	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch==find) {
			System.out.println("the index of: "+"["+find+"]"+" = "+i);
			break;
		}
	}
}
}
