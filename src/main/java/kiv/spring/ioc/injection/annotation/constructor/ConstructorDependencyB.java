package kiv.spring.ioc.injection.annotation.constructor;

import org.springframework.stereotype.Component;

@Component("constructorDependencyB")
public class ConstructorDependencyB {

    @Override
    public String toString() {
        return "Hello from " + getClass().getName();
    }
    
}
