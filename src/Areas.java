
public class Areas {

	public static double shapeArea(double radius)
	{
		return (Math.PI * (radius * radius));
	}

	public static int shapeArea(int length, int width)
	{
		return (length * width);
	}
	
	public static double shapeArea(double radius, double height)
	{
		return (Math.PI * (radius * radius) * height);
	}
}
