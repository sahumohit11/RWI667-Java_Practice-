class Shape{
	private int borderwidth=0;
	private String color=null;
	public Shape(int borderwidth, String color) {
		super();
		this.borderwidth = borderwidth;
		this.color = color;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public String getColor() {
		return color;
	}
	
}
class Circle{
	private int radius=0;
	private Shape shape;
	public Circle(int radius, Shape shape) {
		super();
		this.radius = radius;
		this.shape = shape;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void show() {
		System.out.println("Circle Radius = "+radius+"\n"+
				"Shape property: = "+"borderwidth:= "+shape.getBorderwidth()+"  "+"color:= "+shape.getColor());
	}
	
}

public class AggregationEx2 {
public static void main(String[] args) {
	Shape s =new Shape(12,"Yellow");
	Shape s1 =new Shape(2,"Blue");
	
	Circle c=new Circle(5,s);
	Circle c1=new Circle(8,s1);
	c.show();
	c1.show();

	
}
}
