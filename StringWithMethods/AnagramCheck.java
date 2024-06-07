import java.util.Arrays;

public class AnagramCheck {
public static void main(String[] args) {
	
	String str1 = "listen";
    String str2 = "silent";
	
	char ar1[]=str1.toCharArray();
	char ar2[]=str2.toCharArray();
	Arrays.sort(ar1);
	Arrays.sort(ar2);
	
	if(Arrays.equals(ar1, ar2))
	{
		System.out.println("2 String is anagram");
	}
	else {
		System.out.println("2 String is not  anagram");
	}

}
}
