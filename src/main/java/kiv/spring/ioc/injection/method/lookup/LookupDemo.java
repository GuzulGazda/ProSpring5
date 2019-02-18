/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.ioc.injection.method.lookup;

import kiv.spring.ioc.injection.method.lookup.model.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/lookup-method.xml");
        context.refresh();
        DemoBean abstractBean = (DemoBean) context.getBean("abstractLookupBean");
        DemoBean standardBean = (DemoBean) context.getBean("standardLookupBean");
        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);
    }

    private static void displayInfo(String beanName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();

        System.out.println("" + beanName + ": Singer Instances the Same? "
                + (singer1 == singer2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100000; x++) {
            Singer singer = bean.getMySinger();
            singer.sing();
        }
        stopWatch.stop();
        System.out.println("100000 gets took "
                + stopWatch.getTotalTimeMillis() + " ms");
    }

}
