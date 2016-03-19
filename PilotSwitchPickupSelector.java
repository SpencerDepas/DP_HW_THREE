package com.clearfaun.design.patterns;

/**
 * Created by SpencerDepas on 3/18/16.
 */
public class PilotSwitchPickupSelector extends CustomShopDecorator {

    Guitar guitar;

    public PilotSwitchPickupSelector(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String getDescription() {
        return guitar.getDescription() + "With a pilot switch as a pickup selector.\n";
    }

    @Override
    public int cost() {
        return guitar.cost() + 22;
    }
}
