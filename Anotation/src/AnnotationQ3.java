	import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
	 int sequence();
}

class MyClass{
	@Execute(sequence=1)
	public void MyMethod2() {
		System.out.println("Annotation 2");
	}
	@Execute(sequence=2)
	public void MyMethod1() {
		System.out.println("Annotation 1");
	}
	@Execute(sequence=3)
	public void MyMethod3() {
		System.out.println("Annotation 3");
	}
}
public class AnnotationQ3{
	public static void main(String[] args)throws Exception {
		MyClass m = new MyClass();
		Method a = m.getClass().getMethod("MyMethod1");
		Method b = m.getClass().getMethod("MyMethod2");
		Method c = m.getClass().getMethod("MyMethod3");
		Execute a1 = a.getAnnotation(Execute.class);
		Execute b1 = b.getAnnotation(Execute.class);
		Execute c1 = c.getAnnotation(Execute.class);
		System.out.println(a);
		System.out.println(b1.sequence());
		System.out.println(c1.sequence());
	}
}