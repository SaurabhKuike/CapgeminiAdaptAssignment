import java.util.Scanner;

public class Zerotohund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    int number=input.nextInt();
		while(number<1000) {
		 int b,c;
		    int[] a=new int[5];
		    int cube=0;
		    int flag=0;
		    b=number;
		    while(b>0)
		    {
		    b=b/10;
		    flag++;
		    
		    }
		    c=number;
		    for(int i=0;i<flag;i++)
		    {
		    a[i]=c%10;
		    c=c/10;
		    }
		    for(int i=0;i<flag;i++)
		    {
		    cube=cube+a[i]*a[i]*a[i];
		    }
		    if(cube==number)
		    {
		    	System.out.print(cube+"  ");
		    }
        number++;
	}
		input.close();
	}
}
