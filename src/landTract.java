
public class landTract {

	private int length;
	private int width;
	private int area;
	
	public int getArea(int l, int w)
	{
		length = l;
		width = w;
		area = l * w;
		return area;
	}
	
	public boolean equals(landTract object2)
	{
		boolean status;
		
		if(length == object2.length && width == object2.width)
		{
			status = true;
		}
		else
			status = false;
		
		return status;
	}
	public String toString()
	{
		String str = "Tract Area 1: " + area;
		return str;
	}
	
}
