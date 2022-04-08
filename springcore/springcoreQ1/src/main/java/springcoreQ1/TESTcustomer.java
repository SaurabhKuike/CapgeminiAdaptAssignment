package springcoreQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TESTcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("customer.xml");
		Customer customer= (Customer) context.getBean("customer");
		System.out.println(customer);

	}

}
