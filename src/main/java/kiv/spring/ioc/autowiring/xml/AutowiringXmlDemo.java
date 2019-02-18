package kiv.spring.ioc.autowiring.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AutowiringXmlDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/autowiring-xml.xml");
        ctx.refresh();

        Target t = null;
        System.out.println("Using byName:\n");
        t = (Target) ctx.getBean("targetByName");
        System.out.println("\nUsing byType:\n");
        t = (Target) ctx.getBean("targetByType");
        System.out.println("\nUsing constructor:\n");
        t = (Target) ctx.getBean("targetConstructor");
        ctx.close();
    }
}
