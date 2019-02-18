package kiv.spring.ioc.injection.xml.field;

import org.springframework.stereotype.Component;

public class FieldDependencyA {
    @Override
    public String toString() {
        return "Hello from " + getClass().getName();
    }
}
