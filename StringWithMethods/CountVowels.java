
public class CountVowels {
public static void main(String[] args) {
	
	String str="java is a platform independent language";
	
	String vowel=str.replaceAll("[AEIOUaeiou]", "");
	System.out.println("total Vowels in string:= "+vowel.length());
			
}
}
