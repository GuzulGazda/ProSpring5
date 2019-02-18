package kiv.spring.ioc.injection.xml.setter;

public class SetterInjection {

    private DependencyA dependencyA;

    private DependencyB dependencyB;

    public void setDependencyA(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }

    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }

    @Override
    public String toString() {
        return "SetterInjection class contains dependencies: \n\t"
                + dependencyA.toString() + "\n\t" + dependencyB.toString();
    }
}
