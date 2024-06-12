class A extends Thread{
    public void run(){
       for (int i=0;i<6;i++)
       {
          try {
              System.out.println("Akhilesh");
              System.out.println("akash");
              System.out.println("arun");
              Thread.sleep(1000);
          }
          catch (InterruptedException e)
          {
              System.out.println(e);
          }
       }
    }
}
public class Main{
    public static void main(String[] args) {
        A a=new A();
        a.start();

    }
}