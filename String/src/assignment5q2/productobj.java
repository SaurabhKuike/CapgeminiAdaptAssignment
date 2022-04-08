package assignment5q2;
import java.util.HashSet;

public class productobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> unique=new HashSet<String>();
		unique.add("saurabh");
		unique.add("saurabh");// it will get rejected as HashSet store unique objects only
		unique.add("reyna");
		unique.add("skye");
		unique.add("pheonix");
		unique.add("sage");
		unique.add("astra");
		unique.add("jett");
		unique.add("shroud");
		unique.add("rohan");
		unique.add("savita");
		unique.add("sonam");
		System.out.println(unique);
	}

}
