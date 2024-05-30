class B extends A{
public B(){
System.out.println("B const");
}
public B(int a){
System.out.println("B 1 const");
}
public B(int a,int b){
System.out.println("B 2 const");
}
@Override
public void add(int a,int b){
System.out.println("B add mtd:= "+(a+b));
}
public static void Add(int a,int b){
System.out.println("B add static  mtd:="+(a+b));
}
}