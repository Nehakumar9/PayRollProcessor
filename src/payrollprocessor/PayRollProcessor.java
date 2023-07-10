package payrollprocessor;
class EmployeeDetails{
	String name;
	double salary;
	double hourlyRate;
	double hoursWorked;
	
	public void calculatePay(double salary) {
		System.out.println(name+"->"+"Salaried employee"+"="+salary*30);
	}
	public void calculatePay(double salary,double hourlyRate,double hoursWorked) {
		System.out.println(name+"->"+"Hourly employee"+"="+hourlyRate*hoursWorked);
	}
}
public class PayRollProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employeedetails = new EmployeeDetails();
		employeedetails.name="Neha";
		employeedetails.calculatePay(50000);
		employeedetails.calculatePay(500000,15,9);
	}

}
