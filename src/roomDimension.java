
public class roomDimension {

	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea()
	{
		return length * width;
	}
	@Override
	public String toString() {
		return "roomDimension [length=" + length + ", width=" + width + "]";
	}
	
	
	
}
