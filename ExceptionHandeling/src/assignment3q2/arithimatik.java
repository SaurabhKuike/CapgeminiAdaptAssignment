package assignment3q2;
import java.util.Scanner;

public class arithimatik {

	public static void main(String[] args) throws UnsupportedOperationException{
     
  Scanner Input=new Scanner(System.in);
  int a=Input.nextInt();
  int b=Input.nextInt()	;
  if(b==0) {
	  Input.close();
	  throw new UnsupportedOperationException("Access denied - nuber must be not equal to 0.");
	  
  }else {
  double c=a/b;
  
  System.out.print(c);
  }
  System.out.println("\n EXIT");
  Input.close();
	}
}
