
public class CountFrequencyOfEachCharacter {
public static void main(String[] args) {
	
	String str="Java is a high level object oriented programming language";
	
	
	for(char c='a'; c<='z'; c++){ 
	    int count=0;
	    for(int j=0; j<str.length(); j++){
		    char ch=str.charAt(j);
		    if(c==ch){
	           count++;
		    }
	    }
	     if(count>0){
		    System.out.println(c+" = times = "+count);
		 }  
	}
}
}
