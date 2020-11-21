public class Rectangle extends Shape {
	public double width;
	public double length;
	Rectangle()
	{
		super();
		width=1.0;
		length=1.0;
	}
	Rectangle(double w,double l)
	{
		super();
		width=w;
		length=l;
	}
	Rectangle(double w,double l,String c,boolean f)
	{
		super(c,f);
		width=w;
		length=l;
	}
	void setWidth(double w)
	{
		width=w;
	}
	public double getWidth()
	{
		return width;
	}
	void setLength(double l)
	{
		length=l;
	}
	double getLength()
	{
		return length;
	}
	double getArea()
	{
		return (length*width);
	}
	double getPerimeter()
	{
		return (2*(length+width));
	}
	public String tostring()
	{
		return "A rectangle with width= " +width+ " and length= " +length+ ",which is subclass of " +super.tostring();
	}
}
