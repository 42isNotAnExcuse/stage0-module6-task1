package com.epam.mjc.stage0;

public class Animal {

    public static void main(String[] args) {
        System.out.println(new Bird().getDescription());
        System.out.println(new Dog().getDescription());
    }

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numOfPaws, boolean isFur) {
        this.color = color;
        this.numberOfPaws = numOfPaws;
        this.hasFur = isFur;
    }

    public void setNumberOfPaws(int nop) {
        numberOfPaws = nop;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setHasFur(boolean gf) {
        hasFur = gf;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    public String getDescription() {
        String paws = numberOfPaws > 1 ? "paws" : "paw";
        String furOrNot = hasFur ? "a" : "no";

        return String.format("This animal is mostly %s. It has %d %s and %s fur.",
                color, numberOfPaws, paws, furOrNot);
    }
}
