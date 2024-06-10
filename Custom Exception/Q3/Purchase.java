public class Purchase{
 public static void main(String[]args){
 
 String item=args[0];
 String os=args[1];

if(item.equalsIgnoreCase("mac") && os.equalsIgnoreCase("IOS")){
	System.out.println("Purchased item:= apple MACBook  ...!");
}
else{
 throw new PurchaseException();
}

}
}