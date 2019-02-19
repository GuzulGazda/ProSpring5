/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.aop.pointcut.static_pointcut;

import kiv.spring.aop.pointcut.SimpleAdvice;
import kiv.spring.model.GoodGuitarist;
import kiv.spring.model.GreatGuitarist;
import kiv.spring.model.Singer;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class StaticPointcutDemo {

    public static void main(String[] args) {
        GoodGuitarist johnMayer = new GoodGuitarist();
        GreatGuitarist eltonJohn = new GreatGuitarist();
        
        Singer proxyOne;
        Singer proxyTwo;
        
        Pointcut pointcut = new SimpleStaticPointcut();
        Advice advice = new SimpleAdvice();
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, advice);
        
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(johnMayer);
        proxyOne = (Singer) pf.getProxy();
        
        pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(eltonJohn);
        proxyTwo = (Singer) pf.getProxy();
        
        proxyOne.sing();
        proxyTwo.sing();
    }
}
