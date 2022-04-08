package assignment2Q3;

import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    ArrayList<Integer> total=new ArrayList<Integer>();
    @Override
    public int getCash() {
    	int totalcash=totalDeposits+creditLimit;
    	total.add(totalcash);
    	return 0;
    	
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    ArrayList<Integer> total=new ArrayList<Integer>();
    public int getCash() {
    	int totalcash=totalDeposits+fixedDepositAmount;
    	total.add(totalcash);
    	return 0;
    	
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(int  cash){
    	System.out.println(cash);
    	return 0;
    	
    }
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {
    	SavingsAccount x=new SavingsAccount();
    	CurrentAccount y=new CurrentAccount();
    	Assignment2Q3 p=new Assignment2Q3();
    	y.getCash();
    	int saving= x.getCash();
    	int current =y.getCash();
    	System.out.println(x);
    	p.totalCashInBank(saving);
    	p.totalCashInBank(current);
    	
    	
    	
    	
    }
}

