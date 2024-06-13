class Test1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
			System.out.println(i+" from test");
		}
	
	}
}
class Circle1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
			System.out.println(i+" from circle");
		}
	}
}
public class PrioprityEx {
public static void main(String[] args) {
	
	Test1 t =new Test1();
	Circle1 c=new Circle1();
	t.setPriority(10);
	c.setPriority(1);
	t.start();
	c.start();
	System.out.println(Thread.currentThread().getName());
	for(int i=0;i<=5;i++) {
		System.out.println(i+" from main");
	}
}
}
