public class UserPs{
 public static void main(String[]args){
 
 String userName=args[0];
 String userPswd=args[1];

if(userName.equalsIgnoreCase("root")&&userPswd.equals("root")){
	System.out.println("Login Successfully...!");
}
else{
 throw new LoginException();
}

}
}