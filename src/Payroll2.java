
public class Payroll2 {

	private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	private int[] hours = new int[7];
	private double[] payRate = new double[7];
	private double[] wages = new double[7];
	
	public int[] getHours() {
		return hours;
	}
	public void setHours(int[] hours) {
		this.hours = hours;
	}
	public double[] getPayRate() {
		return payRate;
	}
	public void setPayRate(double[] payRate) {
		this.payRate = payRate;
	}
	public int[] getEmployeeId() {
		return employeeId;
	}
	public void calcWages()
	{
		for(int i =0;i<employeeId.length;i++)
		{
			wages[i] = payRate[i] * hours[i];
		}
		
	}
	public double getGrossPay(int empId)
	{
		double wage=0;
		for(int i =0;i<employeeId.length;i++)
		{
			if(employeeId[i] == empId)
			{
				wage = wages[i];
			}
		}
		return wage;
		
	}
	
}
