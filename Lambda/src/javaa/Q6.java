package javaa;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;


public class Q6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("amigo","sheesh","lol","sad","emanual");
        UnaryOperator<String> u = (String text)->text;
        for(String list1:list) {
        	String test = u.apply(list1);
        	System.out.println(test.replaceAll(list1, list1.toUpperCase()));
        }
    }
}