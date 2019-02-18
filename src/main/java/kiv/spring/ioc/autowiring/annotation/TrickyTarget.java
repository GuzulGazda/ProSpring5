package kiv.spring.ioc.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrickyTarget {
        private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public TrickyTarget() {
        System.out.println("TrickyTarget () called");
    }

    public TrickyTarget(Foo fooOne) {
        System.out.println("TrickyTarget (Foo) called");
    }

    public TrickyTarget(Foo fooOne, Bar bar) {
        System.out.println("TrickyTarget (Foo, Bar) called");
    }

    @Autowired
    public void setFooOne(Foo fooOne) {
        System.out.println("Property FooOne set");
    }

    @Autowired
    public void setFooTwo(Foo fooTwo) {
        System.out.println("Property FooTwo set");
    }

    @Autowired
    public void setBar(Bar bar) {
        System.out.println("Property Bar set");
    }

    
}
