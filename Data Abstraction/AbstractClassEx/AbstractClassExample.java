abstract class Music{

public abstract void musicRhythm();
public void musicGenre(){
   System.out.println("Pop");
}
 }

class Singer extends Music{

public void musicRhythm(){
System.out.println("beats");
}
public void instrument(){
System.out.println("Piano");
}
 }

public class AbstractClassExample{
 public static void main(String[]args){

 // Music m=new Music //error-can not be instantiated

Singer s=new Singer();
s.instrument();
s.musicRhythm();
s.musicGenre();

}
 }
