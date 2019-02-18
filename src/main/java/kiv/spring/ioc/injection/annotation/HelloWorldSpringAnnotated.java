package kiv.spring.ioc.injection.annotation;



import kiv.spring.ioc.injection.annotation.constructor.ConstructorInjection;
import kiv.spring.ioc.injection.annotation.setter.SetterInjectionAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWorldSpringAnnotated {
	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
                
                ConstructorInjection constructorInjection = ctx.getBean("constructor", ConstructorInjection.class);
                System.out.println(constructorInjection);
                
                SetterInjectionAnnotation sia = ctx.getBean("setter", SetterInjectionAnnotation.class);
                System.out.println(sia);  
	}
}
