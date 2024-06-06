
public class RemoveAllRepeatedCharacter {
public static void main(String[] args) {
	String str="java is a portable language";
	String str2="";

		for(int i=0; i<str.length(); i++){
		    char chi=str.charAt(i);
		    int j;
		    for(j=0; j<str.length(); j++){
			 char chj=str.charAt(j);
			 if(chi==chj){
			    break;
		         }
	            }
                    if(i==j){
                       str2=str2+chi;
		    }
                    if(chi==' '){
         		       str2=str2+' ';
         		    }
		}

	System.out.println(str2);
}
}
