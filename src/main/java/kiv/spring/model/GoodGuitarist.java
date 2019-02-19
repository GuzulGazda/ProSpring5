package kiv.spring.model;

public class GoodGuitarist implements Singer {

    private String lyric = "You're gonna live forever in me";

    @Override
    public void sing() {
        System.out.println("Who says I can't be free \n"
                + "From all of the things that I used to be");
    }

}
