package kiv.spring.ioc.injection.xml;

import kiv.spring.ioc.injection.xml.constructor.ConstructorInjection;
import kiv.spring.ioc.injection.xml.field.FieldInjection;
import kiv.spring.ioc.injection.xml.setter.SetterInjection;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class InjectionDemoXML {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory-config.xml"));

        SetterInjection setterInjection = (SetterInjection) factory.getBean("injection");
        FieldInjection fieldInjection =  (FieldInjection) factory.getBean("f-injection");
        ConstructorInjection constructorInjection = (ConstructorInjection) factory.getBean("c-injection");
        System.out.println(setterInjection);
        System.out.println(fieldInjection);
        System.out.println(constructorInjection);
    }
}
