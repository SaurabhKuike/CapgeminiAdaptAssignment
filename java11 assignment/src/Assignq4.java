import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignq4 {

	public static void main(String[] args) {
		int track = 0;
		// TODO Auto-generated method stub
FileInputStream fin=null;
try {
	fin=new FileInputStream("Students.txt")	;
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("file not created");
}

	try {
		do {
	
		track=fin.read()	;
		System.out.print((char)track);
		}while(track!=-1);}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("NULL");
	}
	
	
	
	}
	

	
}
