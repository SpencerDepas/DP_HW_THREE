package com.clearfaun.design.patterns;

/**
 * Created by SpencerDepas on 3/18/16.
 */
public abstract class Guitar {

    protected String description;

    public Guitar() {
        description = "a beautiful ZEKE guitar";
    }


    public String getDescription() {
        return description;
    }

    public abstract int cost();

}
