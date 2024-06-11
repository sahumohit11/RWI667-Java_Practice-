class Test implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(i+" test class");
		}
	}
}
public class RunnableEx {
public static void main(String[] args) {
	
	Test t=new Test();
	Test t1=new Test();
	
	Thread th=new Thread(t);
	Thread th1=new Thread(t1);
	th.start();
	th1.start();
	
	for(int i=1; i<=20; i++) {
		System.out.println(i+" Main method");
	}
	
}
}
