/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.aop.before_advice.securityexample;

import org.springframework.aop.framework.ProxyFactory;

public class SecurityDemo {

    public static void main(String[] args) {
        SecurityManager manager = new SecurityManager();
        SecureBean bean =  getSecureBean();

        manager.login("John", "pwd");
        bean.writeSecureMessage();
        manager.logout();

        try {
            manager.login("invalidUser", "pwd");
            bean.writeSecureMessage();
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            manager.logout();
        }

        try {
            bean.writeSecureMessage();
        } catch (SecurityException ex) {
            System.out.println("Exception Caught: " + ex.getMessage());
        }
    }

    private static SecureBean getSecureBean() {
        SecureBean target = new SecureBean();
        SecurityAdvice advice = new SecurityAdvice();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);
        SecureBean proxy = (SecureBean) factory.getProxy();
        return proxy;
    }

}
