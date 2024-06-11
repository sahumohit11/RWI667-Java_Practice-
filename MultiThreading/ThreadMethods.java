class Example extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=15; i++) {
			System.out.println(i+" From Example Class");
		}
	}
}

public class ThreadMethods {
public static void main(String[] args)throws InterruptedException {
	
	Example e=new Example();
	Example e1=new Example();
	Example e2=new Example();
	Thread.sleep(5000);
	e.start();
	e1.start();
	
	e2.start();
	
	
	
	for(int i=0;i<=15; i++) {
		System.out.println(i+" From Main Method");
	}
	
}
}
