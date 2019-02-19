/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.aop.pointcut.regular_expr;

import kiv.spring.aop.pointcut.SimpleAdvice;
import kiv.spring.model.Guitarist;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class RegexpPointcutDemo {

    public static void main(String[] args) {
        Guitarist guitarist = new Guitarist();
        
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPattern(".*sing.*");
        
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, new SimpleAdvice());
        
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(guitarist);
        pf.addAdvisor(advisor);
        
        Guitarist proxy = (Guitarist) pf.getProxy();
        
        proxy.rest();
        proxy.sing();
        proxy.sing2();
    }
}
