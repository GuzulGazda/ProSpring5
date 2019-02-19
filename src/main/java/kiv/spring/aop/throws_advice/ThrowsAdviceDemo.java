/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.aop.throws_advice;

import org.springframework.aop.framework.ProxyFactory;

public class ThrowsAdviceDemo {

    public static void main(String[] args) {
        ErrorBean target = new ErrorBean();
        
        ProxyFactory pf = new  ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(new SimpleThrowsAdvice());
        
        ErrorBean proxy = (ErrorBean) pf.getProxy();
        
        try {
            proxy.errorProneMethod();
        } catch (Exception ignored) {
        }
        
        try {
            proxy.otherErorProneMethod();
        } catch (Exception ignored) {
        }
    }    
}
