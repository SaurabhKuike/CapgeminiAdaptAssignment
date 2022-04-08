package javaa;

import java.util.ArrayList;

public class Q4{
	public static void main(String[] args) {
		ArrayList<String> remove = new ArrayList<>();
		remove.add("saurabh");
		remove.add("kumar");
		remove.add("maith");
		remove.removeIf(r->r.length()%2!=0);
		System.out.println(remove);
	}
}