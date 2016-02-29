
public class RoomCarpet {
	
	private roomDimension size;
	private double price;

/*	public RoomCarpet(roomDimension s, double p)
	{
		this.size = s; 
		this.price = p;
		
		
	}*/
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public double getTotalCost()
	{
		return (double)(size.getArea() * getPrice());
	}

	@Override
	public String toString() {
		return "RoomCarpet [size=" + size + ", price=" + price + ", getTotalCost()="
				+ getTotalCost() + "]";
	}
	
}
