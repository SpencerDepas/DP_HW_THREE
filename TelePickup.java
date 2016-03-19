package com.clearfaun.design.patterns;

/**
 * Created by SpencerDepas on 3/18/16.
 */
public class TelePickup extends CustomShopDecorator {

    Guitar guitar;

    public TelePickup(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + "With a sweet vintage Telecaster pickup.\n";
    }

    @Override
    public int cost() {
        return guitar.cost() + 99;
    }
}
