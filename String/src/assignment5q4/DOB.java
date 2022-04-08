package assignment5q4;

import java.util.LinkedList;

public class DOB {
	  int date,month,year;
	    
	    public DOB(int date,int month,int year) {
		// TODO Auto-generated constructor stub
	    	this.date = date;
	        this.month = month;
	        this.year = year;
	}

	
	    

	    public String toString(){
	        return date+"-"+month+"-"+year;
	    }

	    public int getYear(){
	        return year;
	    }
	    
	    public static void main(String[] args) {
	        LinkedList<DOB> dob = new LinkedList<>();
	        

	        dob.add(new DOB(29,10,1999));
	        dob.add(new DOB(28,2,1992));
	        dob.add(new DOB(28,06,1994));
	        dob.add(new DOB(18,1,2000));
	        dob.add(new DOB(2,12,2002));
	        dob.add(new DOB(2,3,2010));
	        dob.add(new DOB(8,6,2005));

	        for (int i = 0 ; i<dob.size();i++){
	            int year = dob.get(i).getYear();
	            if (year%4==0){
	                System.out.println(dob.get(i)+" : Born in Leap Year.");
	            }else{
	                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
	            }
	            
	        }
	    }
	    
	}


