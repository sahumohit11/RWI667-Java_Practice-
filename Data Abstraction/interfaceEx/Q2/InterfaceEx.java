interface Animal{
	void animalBreed();
	void leg();
	void speak();

}

class Dog implements Animal{

	@Override
	public void animalBreed() {
		System.out.println("Dog Breed is: Labra");
		
	}

	@Override
	public void leg() {
		System.out.println("2 leg");
		
	}

	@Override
	public void speak() {
		System.out.println("bark bark");
		
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

	@Override
	public void speak() {
		System.out.println("Meow Meow");
		
	}
	
}
public class InterfaceEx {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.animalBreed();
		d.leg();
		d.speak();
		
		Cat c=new Cat();
		c.animalBreed();
		c.leg();
		c.speak();
	}

}
