import java.util.Scanner;
public class TaxAmount { 
	public double calculateTaxAmount(int ctc){
		double tax;
		if(ctc>0 && ctc<=180000) {
			System.out.println("nil");
			return 0;
		}
		if(ctc>180001 && ctc<=300000) {
			tax=(ctc)*0.1;
			return tax;
		}
		if(ctc>300001 && ctc<=500000) {
			tax=(ctc)*0.2;
			return tax;
		}
		if(ctc>500001 && ctc<=1000000) {
			tax=(ctc)*0.3;
			return tax;
		}else
			return 0;
	
		
	}
}
 class Asssign5 {
    public static void main(String args[]) {
    	int ct;
    	Scanner input=new Scanner(System.in);
    	ct=input.nextInt();
    	TaxAmount x=new TaxAmount();
    	double z=x.calculateTaxAmount(ct);
    	System.out.println("tax Amount"+z);
    	input.close();
    	
    	
    	
    }
}




