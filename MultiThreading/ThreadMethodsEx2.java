class Demo extends Thread{
	@Override
	public void run() {
			System.out.println(" From Example Class");
		}
	}
public class ThreadMethodsEx2 {
	public static void main(String[] args) throws InterruptedException {
		Demo d=new Demo();
		Demo d1=new Demo();
		System.out.println(d.getState()+" d state");
		d.start();	
		d1.start();
	
		System.out.println(d.getState()+" d state");
		d1.interrupt();
		Thread.yield();
			
			    System.out.println(Thread.currentThread());
				System.out.println(d.getName());
				System.out.println(d1.getId());
				
				System.out.println(d.getState()+" d state");
				System.out.println(d1.isAlive());
				
				System.out.println(" From Main Method");
				
				System.out.println(Thread.activeCount());
				
				System.out.println(d.getState()+" d state");
	}
	

}
