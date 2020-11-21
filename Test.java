public class Test 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle(2.1,"red",false);
		System.out.println(c.tostring());
		System.out.println("Area is: " +c.getArea());
		System.out.println("Perimeter is: " +c.getPerimeter());
		Rectangle r=new Rectangle(1.0,2.0,"blue",true);
		System.out.println(r.tostring());
		System.out.println("Area is: " +r.getArea());
		System.out.println("Perimeter is: " +r.getPerimeter());
		Square s=new Square(2.0);
		System.out.println(s.tostring());
		System.out.println("Area is: " +s.getArea());
		System.out.println("Perimeter is: " +s.getPerimeter());
	}
}
