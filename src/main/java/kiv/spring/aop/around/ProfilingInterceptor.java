package kiv.spring.aop.around;

import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class ProfilingInterceptor implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(invocation.getMethod().getName());
        Object returValue = invocation.proceed();
        stopWatch.stop();
        dumpInfo(invocation, stopWatch.getTotalTimeMillis());
        return returValue;
    }

    private void dumpInfo(MethodInvocation invocation, long totalTimeMillis) {
        Method method = invocation.getMethod();
        Object target = invocation.getThis();
        Object[] args = invocation.getArguments();
        
        System.out.println("=========== INFO ======================");
        System.out.println("Method: " + method.getName());
        System.out.println("On object type " + target.getClass().getName());
        System.out.println("With arguments:");
        for (Object arg : args) {
            System.out.println("\t " + arg);
        }
        System.out.println("It tooks  " + totalTimeMillis + " ms.");
    }
    
}
