
public class FindNonRepeatedChar {
public static void main(String[] args) {
	
	String str="java is a free form language";
	boolean c=false;
	char c1=' ';
	
	for(int i=0; i<str.length();i++) {
		char ch=str.charAt(i);
		
		if(str.indexOf(ch)==str.lastIndexOf(ch)) {
			c=true;	
			c1=ch;
		}
		else {
			c=false;
		}
	}
	if(c==true) {
		System.out.println("No non-repeated character found");
	}
	else {
		{
			System.out.println("The first non-repeated character is:"+c1);
		}
	}
}
}
