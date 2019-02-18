/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiv.spring.ioc.autowiring.annotation;

import kiv.spring.ioc.injection.annotation.HelloWorldConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringAnnotationDemo {

    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext (HelloWorldConfiguration.class);
       
       TrickyTarget t = ctx.getBean(TrickyTarget.class);
       
       
    }
}
