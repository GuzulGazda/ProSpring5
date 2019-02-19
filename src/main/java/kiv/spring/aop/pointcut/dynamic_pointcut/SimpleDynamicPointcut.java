package kiv.spring.aop.pointcut.dynamic_pointcut;

import java.lang.reflect.Method;
import kiv.spring.model.GoodGuitarist;
import kiv.spring.model.GreatGuitarist;
import kiv.spring.model.SampleBean;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("Static check for " + method.getName());
        return ("foo".equals(method.getName()));
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        System.out.println("Dynamic check for " + method.getName());
        int x = ((Integer) args[0]).intValue();
        return (x != 100);
    }

    @Override
    public ClassFilter getClassFilter() {
        return cls -> (cls == SampleBean.class );
    }
}
