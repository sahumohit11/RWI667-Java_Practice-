class A{
public A(){
System.out.println("A const");
}
public A(int a){
System.out.println("A 1 const");
}
public A(int a,int b){
System.out.println("A 2 const");
}
public void add(int a,int b){
System.out.println("a add mtd:="+(a+b));
}
public static void Add(int a,int b){
System.out.println("a add static mtd:="+(a+b));
}
}