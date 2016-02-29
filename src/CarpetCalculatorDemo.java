import java.util.Scanner;

public class CarpetCalculatorDemo {
	
	public static void main(String[] args) {
		
			Scanner keyboard = new Scanner(System.in);
			roomDimension room1 = new roomDimension();
			RoomCarpet carpet1 = new RoomCarpet();
		
			System.out.print("Plase enter the dimensions of the room.. \n");
			System.out.print("Length: ");
			room1.setLength(keyboard.nextInt());
			System.out.print("Width: ");
			room1.setWidth(keyboard.nextInt());
			System.out.print("Price of carpet per square foot: ");
			carpet1.setPrice(keyboard.nextDouble());
			
			System.out.println("----------------------------");
			System.out.printf("Area: %d \n", room1.getArea());
			System.out.printf("Cost per square feet: $%.02f \n", carpet1.getPrice());
			System.out.printf("Total: $%.02f  \n", carpet1.getTotalCost());
			System.out.println("----------------------------");
			keyboard.close();
			
			
	}

}
