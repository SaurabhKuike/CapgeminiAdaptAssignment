import java.util.Scanner;

public class assq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      var P=100;
      var R=0.12;
      var t=36;
      Scanner input =new Scanner(System.in);
      P=input.nextInt();
      R=input.nextInt();
     t=input.nextInt();
      
      interface INTERESt{
    	  void print(int a,double r,int c);
      }
      INTERESt x=(var w,var y, var z)->System.out.println(w*y*z);
      x.print(P, R, t);
      input.close();
	}
	

}
