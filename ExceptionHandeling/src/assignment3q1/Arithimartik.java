package assignment3q1;
import java.util.Scanner;
public class Arithimartik {

	public static void main(String[] args) {
     
  Scanner Input=new Scanner(System.in);
  int a=Input.nextInt();
  int b=Input.nextInt()	;
  try{int c=a/b;
  System.out.println(c);
  }
  catch(Exception e) {
	  System.out.println(e);
  }
  System.out.println("EXIT");
  Input.close();
	}

}
