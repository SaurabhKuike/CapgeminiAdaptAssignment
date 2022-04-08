import java.util.Scanner;
class Login{
    public String userId = "Ajay",password = "password";
    public String userpass() {
    	String user,pass;
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter userid");
	user=input.next();
	System.out.println("enter password");
	pass=input.next();
	input.close();
	return loginUser(user,pass);
	
    	
    }
    public String loginUser(String a, String b) {
    	int count=0;
		while(userId != a && password != b && count<3) {
    	
			if(count==3){
	    		System.out.println("You have entered wrong credentials 3 times\r\n"
	    				+ "\r\n"
	    				+ "Contact Admin");
	    		break;
	    	}
    	if(a==userId && b==password)
    	{
    		System.out.println("welcome Ajay");
    		break;
    	}if(a != userId && b != password){
    		System.out.println("wrong credentials,please enter correct credentials");
    		count++;
    		userpass();
    	}
    	
    	
    	
    		
    	}
    	;
    	return a; 
    }

}
class Assign6 {
    public static void main(String[] args) {
    	Login x=new Login();
    	x.userpass();
    	
    	
    }
}




