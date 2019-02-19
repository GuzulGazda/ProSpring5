package kiv.spring.ioc.injection.method.lookup;

import kiv.spring.model.Singer;

public abstract class AbstractLookupDemoBean implements DemoBean {
    public abstract Singer getMySinger();

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
