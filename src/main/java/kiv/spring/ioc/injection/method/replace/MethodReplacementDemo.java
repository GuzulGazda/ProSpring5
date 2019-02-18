/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.ioc.injection.method.replace;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {

    public static void main(String[] args) {
        try (GenericXmlApplicationContext context = new GenericXmlApplicationContext()) {
            context.load("classpath:spring/replace-method.xml");
            context.refresh();

            ReplacementTarget targetChanged = (ReplacementTarget) context.getBean("replacementTarget");
            ReplacementTarget targetStandard = (ReplacementTarget) context.getBean("standardTarget");

            displayInfo(targetChanged);
            displayInfo(targetStandard);
        }
    }

    private static void displayInfo(ReplacementTarget target) {
        System.out.println(target.formatMessage("Thanks for playing, try again!"));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");
        for (int x = 0; x < 1000000; x++) {
            String out = target.formatMessage("No filter in my head");
//commented to not pollute the console
//System.out.println(out);
        }
        stopWatch.stop();
        System.out.println("1000000 invocations took: "
                + stopWatch.getTotalTimeMillis() + " ms");
    }

}
