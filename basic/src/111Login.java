import java.util.Scanner;
class Loginas{
    public String userId = "Ajay",password = "password";
    public String userpass() {
    	String user,pass;
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter userid");
	user=input.next();
	System.out.println("enter password");
	pass=input.next();
	input.close();
	return logincheck(user,pass);
	
    	
    }
    public String logincheck(String a, String b) {
    	int count=0;
    	String m="0";
    	if(count>=3) {
    		System.out.print("exit.Contact admin");
    		return m; 
    	}
if(a==userId && b==password && count<3) {
    		
    		 System.out.println("Welcome Ajay");
    	
    }

if(a!=userId || b!=password || count<3) {
	System.out.print("try again");
	count++;
}
String c=" ";
return c;


    }
    	
   

}
class Assign6 {
    public static void main(String[] args) {
    	Login x=new Login();
    	x.userpass();
    	
    	
    }
}




