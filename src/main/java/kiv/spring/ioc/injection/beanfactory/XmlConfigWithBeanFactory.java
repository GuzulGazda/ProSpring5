package kiv.spring.ioc.injection.beanfactory;

import kiv.spring.ioc.injection.xml.Oracle;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory-config.xml"));
        
        Oracle oracle = (Oracle) factory.getBean("oracle");
        
        System.out.println(oracle.defineMeaningOfLife());
    }
}
