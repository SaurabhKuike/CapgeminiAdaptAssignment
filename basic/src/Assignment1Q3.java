import java.util.Scanner;

import java.lang.Math;
class SiCi {
    public double simpleInterest(double principalAmount,double r,double interestRate){
   
    	double siminterest = (principalAmount*r*interestRate)/100;
    	return siminterest;
    	
    }
    public double compoundInterest(double principalAmount,double r,double interestRate){
    	double compoundinterest;
    	double a=principalAmount*(1+interestRate);
    	a= Math.pow(a,r );
    	compoundinterest=a-principalAmount;
    	return compoundinterest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	double p,r,y,z;
    	double t;
    	Scanner input= new Scanner(System.in) ;
    	p=input.nextDouble();
    	r=input.nextDouble();
    	t=input.nextDouble();
    	SiCi x= new SiCi();
    	y=x.simpleInterest(p,r,t);
    	z=x.compoundInterest(p,r,t);
    	System.out.println(y+"  "+z);
    	input.close();
    }
}