package assignment4q1;

 class employeedetail  {
	
public int ID;
public String Name;
public int salary;
public String depart;
public employeedetail( int ID, String Name, int salary, String depart){
	 this.ID=ID;
	 this.depart=depart;
	 this.Name=Name;
	 this.salary=salary;

}
	
	public void display() {
		System.out.println("ID: "+ID+" Name: "+Name+" Salary: " +salary+" Department: "+depart);
		
	}
}