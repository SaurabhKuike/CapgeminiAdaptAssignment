package assignment2q5;
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
public class destroy {
	
	IceCream i= new IceCream()	;
	Cookie j=new Cookie();
	Candy k= new Candy();
    public static void main(String[] args) {
    	destroy rol=new destroy()	;
    	rol.selectRoles();
    	
    	
    	
    }
    private String selectRoles(){
    	System.out.println("enter Role:");
		Scanner input=new Scanner(System.in);
        String s=input.next();
        input.close();
        return roles(s);
    }
    public String roles(String role){
    	if("owner".equals(role)) {
    		System.out.println("enter item you want to store:");
    		Scanner input=new Scanner(System.in);
            String s=input.next();
            input.close();
            return addItems(s);
            
    }
    	if("customer".equals(role)) {
    		System.out.println("enter item you want to place order:");
    		Scanner input=new Scanner(System.in);
            String s=input.next();
            input.close();
            return placeOrder(s);
            
    	}
    	else {
    		return null;
    	}}
    public String addItems( String t) {
    	System.out.println("enter quantity of item");
    	Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        input.close();
        return addItemsOperation(s, t);
        
    }
    private String addItemsOperation(int choice,String t) {
    	System.out.println("Item: "+t+"  quantity of item added: "+choice);
    	return null;
    }
    
    
    private String placeOrder(String k) {
    	System.out.println("enter quantity of item");
    	Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        input.close();
        return placeOrderOperation(s, k);
        
    	
    }
    @SuppressWarnings("unused")
	private String placeOrderOperation(int choice,String t) {
    	System.out.println("Item: "+t+"  quantity: "+choice);
    	int cost=0;
    	if("cookie".equals(t)) {
    		cost=j.getCost();
    	}
    	if("icecream".equals(t)) {
    		 cost=i.getCost();
    	}
    	if("candy".equals(t)) {
    		 cost=k.getCost();
    	}
    	System.out.println("Total cost:"+cost);
    	return null;
    }
}