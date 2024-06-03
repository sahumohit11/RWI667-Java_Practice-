interface Vehicle{
	void fuel();
	void engine();
}
interface Finance{
	void financeDetails();
}
interface Showroom extends Finance{
	void showroomLocation();
	default void myDefaultMtd(){
		System.out.println("This is default method");
	}
}

class Bike implements Vehicle{
	public void fuel() {
		System.out.println("petrol..");
	}
	public void engine() {
		System.out.println("Electric");
	}
}
class Car implements Vehicle, Showroom{
	@Override
	public void fuel() {
		System.out.println("Diesel..");
	}
	@Override
	public void engine() {
		System.out.println("Austin 7 Brooklands");
	}
	@Override
	public void financeDetails() {
		System.out.println("No finance");
		
	}
	@Override
	public void showroomLocation() {
		System.out.println("Indore showroom");
		
	}
	private void myPrivateMtd() {
		System.out.println("This is private method in car Class");
	}
	public void myDefaultMtd() {
		myPrivateMtd();
		System.out.println("This is default method of Car");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.engine();
		b.fuel();
		System.out.println("_____________________________________");
		Car c=new Car();
		c.fuel();
		c.engine();
		c.financeDetails();
		c.showroomLocation();
		c.myDefaultMtd();
		
	}

}
