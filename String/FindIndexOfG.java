
public class FindIndexOfG {
public static void main(String[] args) {
	
	String str="Java is a high level object oriented programming language";
	char find='g';

	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch==find) {
			System.out.println("the index of g := "+i);
			break;
		}
	}
	
}
}
	
