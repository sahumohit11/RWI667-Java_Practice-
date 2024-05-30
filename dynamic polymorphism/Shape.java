class Shape{
private int borderWidth=0;
private String color=null;

public Shape(){

}
public Shape(int borderWidth,String color){
 this.borderWidth=borderWidth;
 this.color=color;
}
public void setBorderWidth(int borderWidth){
  this.borderWidth=borderWidth;
}
public int getBorderWidth(){
 return borderWidth;
}
public void setColor(String color){
 this.color=color;
}
public String getColor(){
return color;
}
public double area(){
 return 0.0;
}
public double perimeter(){
 return 0.0;
}
}