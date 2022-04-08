package assignment2Q7;
import java.util.Scanner;
abstract class DesertItem {

    abstract public int getCost();
    public int count;
}
class Candy extends DesertItem {
    public int addCandies(int candies) {
    	System.out.println("candies added");
    	count=candies;
    	return 0;
    }

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int cost=30*count;
		
		return cost;
	}
}
class Cookie extends DesertItem {
    public int addCookies(int candies){
    	System.out.println("Cookie added");
    	count=candies;
    	
    	return 0;
    }

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int cost=count*70;
		return cost;
	}
}
class IceCream extends DesertItem {
    public int addIceCreams(int candies){
    	System.out.println("IceCream added");
    	count=candies;
    	return 0;
    }

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int cost=count*70;
		return cost;
		
	}
}
public class Assignment2Q7 {
	
    public static void main(String[] args) {
    	Assignment2Q7 rol=new Assignment2Q7()	;
    	int x=rol.selectRoles();
    	if(x==1) {
    		String y=rol.roles(x);
        	if(y=="yes") {
        		String j=rol.addItems();
        		System.out.println("enter quantity of item");
        		Scanner input=new Scanner(System.in);
                int s=input.nextInt();
                
        		rol.addItemsOperation(s, j);
        		input.close();
    	}if(y=="no") {
    		System.out.println("enter to exit");
    	}
    	
    	
    		
    	}
    	if(x==2){
    		String y=rol.roles(x);
        	if(y=="yes") {
        		String j=rol.placeOrder();
        		System.out.println("enter quantity of item you want to order");
        		Scanner input=new Scanner(System.in);
                int s=input.nextInt();
                
        		rol.addItemsOperation(s, j);
        		input.close();
    	}}
    	
    	
    	
    }
    private int selectRoles(){
    	System.out.println("choose 1 for:customer \n choose 2 for:owner");
    	Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        input.close();
        return s;
    }
    private String roles(int role){
    	if(role==1) {
    	System.out.println("Do you want to add Items to storage"); 
    	Scanner input=new Scanner(System.in);
        String s=input.next();
        input.close();
    	return s;}
    	else {
    		System.out.println("Do you want to place order");
    		Scanner input=new Scanner(System.in);
    		String g=input.next();
    		input.close();
    		return g;
    	}
    	
    		
    	
    }
    private String addItems() {
    	System.out.println("enter item you want to store:");
    	Scanner input=new Scanner(System.in);
        String s=input.next();
        input.close();
        return s;
    	
    }
    private void addItemsOperation(int choice,String t) {
    	System.out.println("added "+t+"in storage"+"quantity:"+choice);
    	
    }
    private String placeOrder() {
    	System.out.println("enter items you want to order:");
    	Scanner input=new Scanner(System.in);
        String s=input.next();
        input.close();
        return s;
    	
    }
    @SuppressWarnings("unused")
	private void placeOrderOperation(int choice,String t) {
    	System.out.println("Item: "+t+"   quantity:"+choice);
    	return;
    }
}

