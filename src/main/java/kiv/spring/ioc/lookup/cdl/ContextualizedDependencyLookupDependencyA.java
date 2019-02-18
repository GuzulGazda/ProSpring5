package kiv.spring.ioc.lookup.cdl;

import kiv.spring.ioc.injection.xml.setter.DependencyA;

public class ContextualizedDependencyLookupDependencyA implements ManagedComponent {

    private DependencyA dependency;

    @Override
    public void performLookup(Container container) {
        this.dependency = (DependencyA) container.getDependency("A");
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
    
    
}
