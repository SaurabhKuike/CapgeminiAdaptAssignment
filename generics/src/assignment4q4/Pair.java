package assignment4q4;
public class Pair<T>
{
T p1, p2;
void setValue(T a, T b)
{
  this.p1 = a;
  this.p2 = b;
}
Pair<T> getValue()
{
  return this;
}
public static void main(String args[ ])
{
  Pair<String> pair = new Pair<String> ( );
  pair.setValue(0,"hello");
  Pair <String> answer= new Pair <String>( );
  answer = pair.getValue();
  System.out.println(answer.p1 + " " + answer.p2);
}
private String setValue(int i, String b) {
	// TODO Auto-generated method stub
	return b;
	
}}