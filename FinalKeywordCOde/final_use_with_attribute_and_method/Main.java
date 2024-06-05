class FinalKeyEx{
public  final int id=10;
public int getId() {
  return id;
} 

public final void display() {
  System.out.println("This is a final method from parent .");
}      
}
class Subclass extends FinalKeyEx{
/*
public void display() {
  System.out.println("Trying to override the final method.");
}
*/ //compilation Error final method can not be overridden
}
public class Main{
public static void main(String[] args){

Subclass s=new Subclass();
s.display();
//s.id=2; //error 
    }
}

