public class User{
 public static void main(String[]args){

  String userName=args[0];
  String userPswd=args[1];

	if(userName.equals("admin") && userPswd.equals("admin")){
	   System.out.println("Login Successfulyy.......Welcome to FaceBook");
	}
	else{
	throw new LoginException();
	}

	


}
 }