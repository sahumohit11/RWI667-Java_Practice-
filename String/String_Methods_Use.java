
public class String_Methods_Use {
	public static void main(String[] args) {
		String str="Java is a high level object oriented programming language";
		String str1="Java is a high level programming language";
		String str2="JAVA IS A HIGH LEVEL programming language";
		
		System.out.println(str.toUpperCase());
		
		System.out.println("___________________________________");
		System.out.println(str.toLowerCase());
		
		System.out.println("___________________________________");
		System.out.println("The index of l:= "+str.indexOf("l"));
		
		System.out.println("___________________________________");	
		System.out.println("The last index of e:= "+str.lastIndexOf("e"));
	
		System.out.println(str.isEmpty());
		System.out.println("___________________________________");
		
		System.out.println(str.charAt(11));
		System.out.println("___________________________________");
		
		System.out.println(str.codePointAt(11));
		System.out.println("___________________________________");
		
		System.out.println((char)str.codePointAt(11));
		System.out.println("___________________________________");
		
		System.out.println(str.codePointBefore(11));
		System.out.println("___________________________________");
		
		System.out.println((char)str.codePointBefore(11));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.contentEquals(str2));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		System.out.println(str.hashCode());
		
		System.out.println(str.substring(11));
		
		System.out.println(str1.replaceAll(str1, str2));
		System.out.println(str1);
		System.out.println("the length of str1:= "+str.length());
		
	}

}
