package kiv.spring.ioc.lookup.cdl;

public interface Container {
    Object getDependency(String key);
}
