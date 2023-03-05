package com.epam.mjc.stage0;


public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String paws = getNumberOfPaws() == 1 ? "paw" : "paws";
        String furOrNot = getHasFur() ? "a" : "no";

        return String.format("This animal is mostly %s. It has %d %s and %s fur. Moreover, it has 2 wings and can fly.",
                getColor(), getNumberOfPaws(), paws, furOrNot);
    }
}
