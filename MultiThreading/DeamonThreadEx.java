class Person extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i+" hello from person class");
		}
	}
}
public class DeamonThreadEx {
public static void main(String[] args) {
	Person p=new Person();
	p.setDaemon(true);
	p.start();
	
	System.out.println(p.isDaemon());
	
	for(int i=0;i<=5;i++) {
		System.out.println(i+" from main method");
	}

}
}
