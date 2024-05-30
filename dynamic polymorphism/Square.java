class Square extends Rectangle{
private int side=0;
public Square(){

}
public Square(int side){
 this.side=side;

}
public Square(int borderWidth,String color,int side){
    super(borderWidth,color);
    this.side=side;
}
public void setSide(int side){
 this.side=side;
}
public int getSide(){
 return side;
}
public void setLength(int length){
    super.setLength(length);
}
public int getLength(){
    return super.getLength();
}
public void setWidth(int width){
    super.setWidth(width);
}
public int getWidth(){
    return super.getWidth();
}
@Override
public double area(){
 return side*side;
}
@Override
public double perimeter(){
 return 4*side;
}
}