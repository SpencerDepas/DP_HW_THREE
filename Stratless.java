package com.clearfaun.design.patterns;

/**
 * Created by SpencerDepas on 3/18/16.
 */
public class Stratless extends Guitar {


    public Stratless() {
        description = "A custom half Stratocaster half Les Paul electric guitar.\n";
    }

    public String getDescription(){
        return description;
    }

    @Override
    public int cost() {
        return 999;
    }
}
