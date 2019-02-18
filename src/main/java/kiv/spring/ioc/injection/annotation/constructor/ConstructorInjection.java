package kiv.spring.ioc.injection.annotation.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("constructor")
public class ConstructorInjection {

    private final ConstructorDependencyA a;
    private final ConstructorDependencyB b;

    @Autowired
    public ConstructorInjection(ConstructorDependencyA a, ConstructorDependencyB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Constructor arguments are \n\t" + a.toString()  + "\n\t" + b.toString();
    }
    
    
}
