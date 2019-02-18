package kiv.spring.ioc.injection.xml.setter;

public class DependencyA {
    private static int counter = 0;
    private int myNumber;
    
    public DependencyA() {
        counter++;
        myNumber = counter;
    }

    @Override
    public String toString() {
        return "Hello from " + getClass().getName() + " with num = " + myNumber;
    }

    
}
