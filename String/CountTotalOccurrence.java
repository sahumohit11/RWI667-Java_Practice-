
public class CountTotalOccurrence {
public static void main(String[] args) {
	String str="Java is a high level object oriented programming language";
	char find ='a';
	int count=0;

	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch==find) {
			count++;
		}
	}
	System.out.println("the total occurrence of : "+"["+find+"]"+" = "+count);
}
}
