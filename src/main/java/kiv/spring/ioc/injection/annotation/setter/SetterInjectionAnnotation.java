package kiv.spring.ioc.injection.annotation.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("setter")
public class SetterInjectionAnnotation {

    private SetterDependencyAnnotation a;

    @Autowired
    public void setA(SetterDependencyAnnotation a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "SetterInjection class contains dependency: \n\t" + a.toString();
    }
}
