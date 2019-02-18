package kiv.spring.ioc.autowiring.xml;

public class Target {
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public Target() {
        System.out.println("Target () called");
    }

    public Target(Foo foo) {
        System.out.println("Target (Foo) called");
    }

    public Target(Foo foo, Bar bar) {
        System.out.println("Target (Foo, Bar) called");
    }

    public void setFooOne(Foo fooOne) {
        System.out.println("Property FooOne set");
    }

    public void setFooTwo(Foo fooTwo) {
        System.out.println("Property FooTwo set");
    }

    public void setBar(Bar bar) {
        System.out.println("Property Bar set");
    }
    
}
