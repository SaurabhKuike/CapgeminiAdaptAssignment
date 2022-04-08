import java.util.Scanner;
class Student {
    private int subjectA,subjectB,subjectC;
    Scanner sc=new Scanner(System.in);
    public int mark[];
    
    
     Student(){
    	System.out.println("enter marks");
    	subjectA=sc.nextInt();
    	subjectB=sc.nextInt();
    	subjectC=sc.nextInt();
    	mark[1]=subjectA;
    	mark[2]=subjectB;
    	mark[3]=subjectC;
    	
    }
     display

  
}

 class Assignment1Q9 {

    public static void main(String[] args) {
    	Student a=new Student();
    	Student b=new Student();
    	Student c=new Student();
    	System.out.print(a.mark);
    	
    	
    	
    }
}

