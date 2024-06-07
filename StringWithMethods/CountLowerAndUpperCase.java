
public class CountLowerAndUpperCase {
public static void main(String[] args) {
	String str="java Is A Programming Language";
	int lc=0,uc=0;
	for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
		if(ch>=65&&ch<=90) {
			uc++;
		}
		else if(ch>=97&&ch<=122) {
			lc++;
			
		}
	}
	System.out.println("total lower case:= "+lc);
	System.out.println("total upper case:= "+uc);
	
}
}
