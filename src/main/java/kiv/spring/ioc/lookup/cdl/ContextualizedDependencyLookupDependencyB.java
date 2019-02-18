package kiv.spring.ioc.lookup.cdl;

import kiv.spring.ioc.injection.xml.setter.DependencyB;

public class ContextualizedDependencyLookupDependencyB implements ManagedComponent {

    private DependencyB dependency;

    @Override
    public void performLookup(Container container) {
        this.dependency = (DependencyB) container.getDependency("B");
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
