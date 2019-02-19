package kiv.spring.aop.pointcut.annotation;

import kiv.spring.model.Guitar;
import kiv.spring.model.Singer;

public class AnnotatedGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("Dream of ways to throw it all away");
    }

    @AdviceRequired
    public void sing(Guitar guitar) {
        System.out.println("play: " + guitar.play());
    }

    public void rest() {
        System.out.println("zzzz");
    }
}
