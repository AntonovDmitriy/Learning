package scalaLearning;
import java.lang.annotation.Annotation;
import java.util.*;

public final class AnnotationTest{
	
	@interface ChangedBy{
		String autor();
		long time() default 0;
	}
	
	@ChangedBy(author = "neo")
	public void test(){
		@ChangedBy(author = "neo", time = 1)
		Class<?> clazz = this.getClass();
		Annotation[] an = clazz.getAnnotations();
	}
}