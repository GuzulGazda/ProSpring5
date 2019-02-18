package kiv.spring.ioc.lookup.cdl;

public class CdlDemo {
    public static void main(String[] args) {
        Container container = new DefaultContainer();
        ManagedComponent managedComponentA = new ContextualizedDependencyLookupDependencyA();
        ManagedComponent managedComponentB = new ContextualizedDependencyLookupDependencyB();
        managedComponentA.performLookup(container);
        managedComponentB.performLookup(container);
        System.out.println("Managed Component A is " + managedComponentA + "\n" + "Managed Component B is " + managedComponentB);
    }
}
