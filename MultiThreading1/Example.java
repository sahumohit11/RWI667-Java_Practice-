class Test2 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
			System.out.println(i+" from test");
			
		}
	
	}
}
class Circle2 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
			System.out.println(i+" from circle");
		}
	}
}
public class Example {
public static void main(String[] args) throws InterruptedException {
	
	Test2 t =new Test2();
	Circle2 c=new Circle2();
	
	t.start();
	c.start();
	t.join();
	Thread.yield();
	System.out.println(Thread.currentThread().getName());
	for(int i=0;i<=5;i++) {
		System.out.println(i+" from main");
	}
}
}
