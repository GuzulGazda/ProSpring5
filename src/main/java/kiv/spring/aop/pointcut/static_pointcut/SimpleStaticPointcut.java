package kiv.spring.aop.pointcut.static_pointcut;

import java.lang.reflect.Method;
import kiv.spring.model.GoodGuitarist;
import kiv.spring.model.GreatGuitarist;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut{

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return ("sing".equals(method.getName()));
    }

    @Override
    public ClassFilter getClassFilter() {
        return cls -> (cls == GoodGuitarist.class || cls == GreatGuitarist.class);
    }
}
