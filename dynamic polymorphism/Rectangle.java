class Rectangle extends Shape{
private int width=0;
private int length=0;

public Rectangle(){

}
public Rectangle(int borderWidth,String color){
    super(borderWidth,color);
}
public Rectangle(int borderWidth,String color,int width,int length){
    super(borderWidth,color);
    this.width=width;
    this.length=length;
} 
public void setWidth(int width){
 this.width=width;
}
public int getWidth(){
 return width;
}
public void setLength(int length){
 this.length=length;
}
public int getLength(){
 return length;
}
@Override
public double area(){
 return length*width;
}
@Override
public double perimeter(){
 return 2*(length+width);
}
}