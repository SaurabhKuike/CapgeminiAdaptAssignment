
import java.util.Scanner;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	String s;
    	s="null";
    	if((subject1Marks>60) && (subject2Marks>60) && (subject3Marks>60) )
    	{
    		s="pass";
			return  s;
    	}
    	if(subject1Marks<60 && subject2Marks<60 && subject3Marks<60) {
		 if((subject1Marks+subject2Marks)>60 || (subject2Marks+subject3Marks)>60||(subject3Marks+subject1Marks)>60)
		{
			
			s="promoted";
			return s;
		}}
    	
		else if( (subject1Marks>60 && subject2Marks<60 && subject3Marks<60) || (subject2Marks>60 && subject1Marks<60 && subject3Marks<60)||(subject3Marks>60 && subject2Marks<60 && subject1Marks<60)||((subject1Marks+subject2Marks+subject3Marks)<60)) {
			
			s=" fail ";
			return s;
			
		}
		else {
		}
    	
		return s;
			
			
		
    	
    	
    	
    }
}
 class Assign1Q4 {
    public static void main(String[] args) {
    	double a,b,c;
    	Scanner input =new Scanner(System.in);
    	a=input.nextDouble();
    	b=input.nextDouble();
    	c=input.nextDouble();
    	ResultDeclaration x=new ResultDeclaration();
    	String y=x.declareResults(a, b, c);
    	input.close();
    	System.out.println("result:"+y);
    	
    	
    }
}

