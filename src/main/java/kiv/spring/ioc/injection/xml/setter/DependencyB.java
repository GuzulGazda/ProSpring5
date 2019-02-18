package kiv.spring.ioc.injection.xml.setter;

public class DependencyB {

    private static int counter = 0;

    public DependencyB() {
        counter++;
    }

    @Override
    public String toString() {
        return "Hello from " + getClass().getName() + " with num = " + counter;
    }
}
