package assignment2q5;
abstract class shapes{
	abstract String draw();
}
class line extends shapes{

	@Override
	String draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing shapes");
		return null;
	}
	
}
class rectangle extends shapes{

	@Override
	String draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
		return null;
	}
	
}
class cube extends shapes{

	@Override
	String draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing cube");
		return null;
	}
	
}
class circle extends shapes{

	@Override
	String draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
		return null;
	}
	
}
class mains{
	public static void main(String[] args) {
		circle s=new circle();
		s.draw();
		
	}
}
	
