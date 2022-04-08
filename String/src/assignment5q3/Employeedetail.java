package assignment5q3;
public class Employeedetail implements Comparable<Employeedetail>{

public int ID;
public String Name;
public int salary;
public String depart;
 public Employeedetail( int ID, String Name, int salary, String depart){
this.ID=ID;
this.depart=depart;
this.Name=Name;
this.salary=salary;
}
 public int getID() {
	 return ID;
 }
 public void setID(int ID)
{
this.ID=ID;
}
 public String getname() {
	 return Name;
 }
 public void setname(String Name )
{
this.Name=Name;
}
 public int getsalary() {
	 return salary;
 }
 public void setsalary(int salary)
{
this.salary=salary;
}
 public String getDepart() {
	 return depart;
 }
 public void setDepart(String depart)
{
this.depart	=depart;
}

@Override
public int compareTo(Employeedetail emp) {
	// TODO Auto-generated method stub
	if (this.ID==emp.getID()) {
		return 0;
	}
	else if(   this.ID>emp.getID()) {
		return 1;
	}
	else {
		return -1;
	}
	
	
		
	}


public void display() {
	System.out.println("ID: "+ID+" Name: "+Name+" Salary: " +salary+" Department: "+depart);
	
}
}
















