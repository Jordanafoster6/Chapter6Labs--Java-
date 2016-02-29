import java.util.Scanner;


public class PayrollDemo2 {

	public static void main(String[] args)
	{
		Payroll p1 = new Payroll();
		Scanner keyboard = new Scanner(System.in);
		
		
		int[] empNumbers = p1.getEmployeeId();
		int[] hrs = new int[7];
		double[] payRate = new double[7];
		
		for(int i =0;i<empNumbers.length;i++)
		{
			System.out.println("Enter the number of hours worked by employee # " + empNumbers[i]);
			hrs[i] = keyboard.nextInt();
			
			System.out.println("Enter the hourly pay rate for employee # " + empNumbers[i]);
			payRate[i] = keyboard.nextInt();
			
		}
		
		p1.setHours(hrs);
		p1.setPayRate(payRate);
		p1.calcWages();
		
		System.out.println("Please enter an employee number and I'll return the gross wages for that employee.");
		int empNum = keyboard.nextInt();
		
		System.out.printf("The gross pay for %d is $%.02f",empNum,p1.getGrossPay(empNum));
	
		keyboard.close();

	}

}
