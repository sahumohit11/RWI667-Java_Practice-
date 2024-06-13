class Test extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class Circle extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
}
public class ThreadEx {
public static void main(String[] args) {
	
	Test t =new Test();
	Circle c=new Circle();
	System.out.println(t.getState());
	t.start();
	c.start();
	System.out.println(t.getState());
	System.out.println(Thread.currentThread().getName());
	System.out.println(t.getId());
	System.out.println(t.getState());
	
}
}
