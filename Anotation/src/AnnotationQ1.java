
import java.lang.annotation.*;  
import java.lang.reflect.*;  
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface test{  
int value() default 1;  
}  
  
//Applying annotation  
class Hello{  
@test 
public void displayMethod(){System.out.println("testing annotation");}  
}  
  
//Accessing annotation  
public class AnnotationQ1{  
public static void main(String[] args)throws Exception{  
  
Hello h=new Hello();  
Method m=h.getClass().getMethod("displayMethod");  
  
test test1=m.getAnnotation(test.class);  
System.out.println("value is: "+test1.value());  
}} 