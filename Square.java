public class Square extends Rectangle 
{
	Square()
	{
		super();
		double side=2.0;
	}
	Square(double s)
	{
		super();
		s=s;
	}
	Square(double s,String c,boolean f)
	{
		super(s,s,c,f);
		s=s;
	}
	double getSide()
	{
		return width;
	}
	void setSide(double s)
	 {
	    super.setLength(s);
	    super.setWidth(s);
	 }
	public String tostring()
	{
		return "A square with side= " +getSide()+ ",which is subclass of " +super.tostring();
	}
	double getArea()
	{
		return getSide()*getSide();
	}
	double getPerimeter()
	{
		return(4*getSide());
	}
}
