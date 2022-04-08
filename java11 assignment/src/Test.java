import java.io.*;
  
public class Test {
    public static void main(String[] args)
        throws IOException
    {
        File file = new File("C:\\Users\\saura\\eclipse-workspace\\java11 assignment\\Students.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        @SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
  
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                paraCount += 1;
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
            }
        }
        if (sentenceCount >= 1) {
            paraCount++;
        }
        System.out.println("Total name count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
        FileInputStream fin=null;
        int track=0;
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