import java.util.Scanner;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    int b,c;
    int[] a=new int[5];
    int cube=0;
    int flag=0;
    b=num;
    while(b>0)
    {
    b=b/10;
    flag++;
    
    }
    c=num;
    for(int i=0;i<flag;i++)
    {
    a[i]=c%10;
    c=c/10;
    }
    for(int i=0;i<flag;i++)
    {
    cube=cube+a[i]*a[i]*a[i];
    }
    if(cube==num)
    {
    return true;}
    else{
    return false;}
    }
}

public class Assignment1Q1 {
	public static void main(String[] args) {
    boolean y;
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    ArmstrongOrNot x=new ArmstrongOrNot();
    y=x.armstrongCheck(number);
    System.out.print(y);
    input.close();
    }
}

