public class Person {
    private String name;
    private Car car; // Aggregation
    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }
    public String getName() {
        return name;
    }
    public Car getCar() {
        return car;
    }
    @Override
    public String toString() {
        return "Person{"+"name='"+name+'\''+",car=" +car+'}';
    }
public static void main(String[] args){
        Car car=new Car("Toyota","Sports");
        Person person = new Person("John", car);

        System.out.println(person);
        System.out.println("Person's car brand: " +person.getCar().getBrand());
        System.out.println("Person's car model: " +person.getCar().getModel());
    }
}
