package assignment5q1;

import java.util.*;
public class contactcls {
	public static void main(String[] args) {
		TreeMap<Long,String> contact=new TreeMap<Long,String>();
		contact.put((long)962619964,"harry");
		contact.put((long)955445589,"jerry");
		contact.put((long)922544551,"mary");
		contact.put((long)825321335,"barry");
		contact.put((long)726621565,"larry");
		contact.put((long)966321565,"gary");
		Collections.reverseOrder();
		System.out.println(contact);
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		
		
	}
	
}