interface Animal{
	void animalBreed();
	void leg();

}
interface RunningSpeed{
	void speed();
}

class Dog implements Animal,RunningSpeed{

	@Override
	public void animalBreed() {
		System.out.println("Dog Breed is: Labra");
		
	}

	@Override
	public void leg() {
		System.out.println("2 leg");
		
	}

	@Override
	public void speed() {
		System.out.println("Fast");
		
	}
	
}
class Cat implements Animal{

	@Override
	public void animalBreed() {
		System.out.println("Dog Breed is: British ShortHair");
		
	}

	@Override
	public void leg() {
		System.out.println("4 Leg");
		
	}
	
}
class Turtle implements Animal,RunningSpeed{

	@Override
	public void animalBreed() {
		System.out.println("Common Musk Turtle");
		
	}

	@Override
	public void leg() {
		System.out.println("4 limbs");
		
	}

	@Override
	public void speed() {
		System.out.println("Very slow speed as comapred to other animals");
		
	}
	
}
public class InterfaceWithMultipleImpleEx {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.animalBreed();
		d.leg();
		d.speed();
		
		Cat c=new Cat();
		c.animalBreed();
		c.leg();
		
		Turtle t=new Turtle();
		t.animalBreed();
		t.leg();
		t.speed();
	}

}
