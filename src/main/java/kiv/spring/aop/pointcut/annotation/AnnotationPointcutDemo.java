/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.aop.pointcut.annotation;

import kiv.spring.aop.pointcut.SimpleAdvice;
import kiv.spring.model.Guitar;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

public class AnnotationPointcutDemo {

    public static void main(String[] args) {
        AnnotatedGuitarist target = new AnnotatedGuitarist();
        
        AnnotationMatchingPointcut pointcut = AnnotationMatchingPointcut.forMethodAnnotation(AdviceRequired.class);
        
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, new SimpleAdvice());
        
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        AnnotatedGuitarist proxy = (AnnotatedGuitarist) pf.getProxy();
        
        proxy.rest();
        proxy.sing();
        proxy.sing(new Guitar());
    }
}
