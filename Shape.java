public class Shape {
	String color;
	boolean filled;
	Shape()
	{
		color="green";
		filled=true;
	}
	Shape(String c,boolean f)
	{
		color=c;
		filled=f;
	}
	boolean isFilled()
	{
		return filled;
	}
	void setFilled(boolean f)
	{
		filled=f;
	}
	String getShape()
	{
		return color;
	}
	void setShape(String c)
	{
		color=c;
	}
	String findFilled()
	{
		if(filled==true)
			return("filled");
		else
			return("not filled");
	}
	public String tostring()
	{
		return "A shape with color of " +color+ " and " +findFilled();
	}
}
