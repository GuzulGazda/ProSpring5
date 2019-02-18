package kiv.spring.ioc.injection.xml.field;

import org.springframework.stereotype.Component;

public class FieldDependencyB {
    @Override
    public String toString() {
        return "Hello from " + getClass().getName();
    }
}
