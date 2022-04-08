package assignment4q2;
import java.util.HashMap;
import java.util.Random;

public class randomhash {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random h=new Random();
		
      HashMap<Integer,Double> randomentry=new HashMap<Integer,Double>();
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      randomentry.put(h.nextInt(1000),h.nextDouble());
      
      
      randomentry.forEach((K,V)->System.out.println("key: "+K+" value: "+V));
	}

}
