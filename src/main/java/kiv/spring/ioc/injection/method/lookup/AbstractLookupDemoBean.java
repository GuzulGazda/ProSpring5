package kiv.spring.ioc.injection.method.lookup;

import kiv.spring.ioc.injection.method.lookup.model.Singer;

public abstract class AbstractLookupDemoBean implements DemoBean {
    public abstract Singer getMySinger();

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
