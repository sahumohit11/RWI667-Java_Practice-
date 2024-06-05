
public class PallindromeCheck {
public static void main(String[] args) {
	String str="naman";
	String str1="";
	String org=str;
	for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
		str1=ch+str1
				;
		System.out.println(str1);
	}
	if(str1.equals(org)) {
		System.out.println("String is Pallindrome..");
	}
	else{
		System.out.println("String is  not Pallindrome..");
	}
}
}
