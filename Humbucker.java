package com.clearfaun.design.patterns;

/**
 * Created by SpencerDepas on 3/18/16.
 */
public class Humbucker extends CustomShopDecorator {

    Guitar guitar;

    public Humbucker( Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + "With a badd ass squeeling Humbucker.\n";
    }

    @Override
    public int cost() {
        return guitar.cost() + 120;
    }
}
