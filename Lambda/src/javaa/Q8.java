package javaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Q8 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2,52,242,13,2,6,7);

        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        Thread t = new Thread(()->dispList.accept(list1));
        t.start();


    }
}