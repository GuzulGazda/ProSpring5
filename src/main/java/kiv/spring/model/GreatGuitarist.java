package kiv.spring.model;

public class GreatGuitarist implements Singer {

    private String lyric = "You're gonna live forever in me";

    @Override
    public void sing() {
        System.out.println("I shot the sheriff, \n"
                + "But I did not shoot the deputy");
    }

}
