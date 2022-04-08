import java.util.ArrayList;
import java.util.Arrays;

public class assq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="A quick brown fox jumps over the lazy dog";
		String[] split=a.split(" ");
		ArrayList<String> word=new ArrayList<String>(Arrays.asList(split));
		String[] LIST=word.toArray(size->new String[size]);
		for (String string : LIST) {
			System.out.println(string);
		}
		
		}

	}


