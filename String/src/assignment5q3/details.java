package assignment5q3;

import java.util.Set;
import java.util.TreeSet;

public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Employeedetail> e=new TreeSet<Employeedetail>();
e.add(new Employeedetail(495450, "saurabh", 80000, "operation"));
e.add(new Employeedetail(445250, "Shubh", 95000, "Finance"));
e.add(new Employeedetail(365450, "Pratap", 80525, "Management"));
e.add(new Employeedetail(256143, "Santosh", 63265, "operation"));
e.add(new Employeedetail(506143, "Sant", 63265, "operation"));
e.add(new Employeedetail(706143, "manuj", 5215, "finance"));
for(Employeedetail z:e) {
	z.display();
}

	}

}
