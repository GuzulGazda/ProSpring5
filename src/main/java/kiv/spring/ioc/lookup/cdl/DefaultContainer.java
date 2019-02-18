package kiv.spring.ioc.lookup.cdl;

import kiv.spring.ioc.injection.xml.setter.DependencyA;
import kiv.spring.ioc.injection.xml.setter.DependencyB;

public class DefaultContainer implements Container{

    @Override
    public Object getDependency(String key) {
        if("A".equals(key)) {
        	return new DependencyA();
        } else if ("B".equals(key)) {
        	return new DependencyB();
        } 
        throw new RuntimeException("Unknown dependency: " + key);
    }
    
}
