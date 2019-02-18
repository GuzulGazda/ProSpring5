package kiv.spring.ioc.injection.annotation.setter;

import org.springframework.stereotype.Component;

@Component("setterAnnotatinDependency")
public class SetterDependencyAnnotation {

    @Override
    public String toString() {
        return "Hello from "+ getClass().getSimpleName();
    }
    
}
