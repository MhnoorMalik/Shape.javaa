
public class Circle extends Shape{
	double radius;
	Circle()
	{
		super();
		radius=1.0;
	}
	Circle(double r)
	{
		super();
		radius=r;
	}
	Circle(double r,String c,boolean f)
	{
		super(c,f);
		radius=r;
	}
	double getRadius()
	{
		return radius;
	}
	void setRadius(double r)
	{
		radius=r;
	}
	public double getArea()
	{
		return (3.14*radius*radius);
	}
	public double getPerimeter()
	{
		return(2*3.14*radius);
	}
	public String tostring()
	{
		return "A circle with radius= " +radius+ " ,which is subclass of " +super.tostring();
	}
}
