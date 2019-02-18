package kiv.spring.ioc.injection.xml.field;

import kiv.spring.ioc.injection.xml.setter.DependencyA;

public class FieldInjection {

    private FieldDependencyA dependencyA;
    private FieldDependencyB dependencyB;
    private DependencyA a;

    public void setDependencyA(FieldDependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }

    public void setDependencyB(FieldDependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }

    public void setA(DependencyA a) {
        this.a = a;
    }
    
    
    
    @Override
    public String toString() {
        return "FieldInjection class contains dependencies: \n\t"
                + dependencyA.toString() + "\n\t" + dependencyB.toString() + "\n\t" + a.toString();
    }

}
