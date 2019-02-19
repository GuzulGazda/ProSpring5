/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.aop.pointcut.dynamic_pointcut;

import kiv.spring.aop.pointcut.SimpleAdvice;
import kiv.spring.model.SampleBean;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class DynamicPointcutDemo {

    public static void main(String[] args) {
        SampleBean target = new SampleBean();
        Advice advice = new SimpleAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(new SimpleDynamicPointcut(), advice);

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        
        SampleBean proxy = (SampleBean) pf.getProxy();
        
        proxy.foo(1);
        proxy.foo(10);
        proxy.foo(100);
        
        proxy.bar();
        proxy.bar();
        proxy.bar();
    }

}
