package kiv.spring.ioc.injection.annotation.constructor;

import org.springframework.stereotype.Component;

@Component("constructorDependencyA")
public class ConstructorDependencyA {

    @Override
    public String toString() {
        return "Hello from " + getClass().getName();
    }
    
}
