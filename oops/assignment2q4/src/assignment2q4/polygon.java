package assignment2q4;

abstract class polygon {
	abstract int area(int l,int b);

}
class square extends polygon {
	@Override
	int area(int l, int b) {
		// TODO Auto-generated method stub
		int area=l*b;
		System.out.println("area of square:"+area);
		return area;
	}

	
	
	
}
class rhombus extends polygon{

	@Override
	int area(int l, int b) {
		
		int area=l*b;
		System.out.println("area of rhombus:"+area);
		return 0;
	}

	
	}
class mains {
public static void main(String[] args) {
	rhombus s=new rhombus();
	square p=new square()	;
	s.area(10, 330);
	p.area(2, 2);
	
	
	
	
	
}
}
