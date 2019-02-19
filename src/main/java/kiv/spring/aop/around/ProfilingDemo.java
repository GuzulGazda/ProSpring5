/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.aop.around;

import org.springframework.aop.framework.ProxyFactory;


public class ProfilingDemo {
    public static void main(String[] args) {
        WorkerBean bean = getWorkerBean();
        bean.doSomeWork(10);
    }

    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(new ProfilingInterceptor());
        return (WorkerBean) pf.getProxy();
    }
    
}
