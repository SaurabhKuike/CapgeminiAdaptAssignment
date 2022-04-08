package assignment4q1;

import java.util.HashSet;

public class generik{
	public static void main(String[] args) {
		HashSet<employeedetail> X= new HashSet<employeedetail>();
		X.add(new employeedetail(133, "saurabh", 45000, "Operation"));
		X.add(new employeedetail(133, "saurabh", 45000, "Management"));
		X.add(new employeedetail(453, "gaurav", 55000, "Operation"));
		X.add(new employeedetail(567, "harry", 95000, "Operation"));
		X.add(new employeedetail(134, "raj", 6000, "finance"));
		for (employeedetail e : X) {
			e.display();
		}
		
		
		
	}
	
	
	
}





