package com.clearfaun.design.patterns;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //System.out.print("Hello world");



        //welcome to ZEKE's custom Guitar shop
        //This is a true story
        //Our custom guitar shop stasrted with a stratocaster
        //We then found an old telecaster
        //We then glued them together!
        //Thus the stratless was born!


        Guitar stratless = new Stratless();


        //here is what we started with
        //but we could not stop there
        //lets add a tele pickup

        stratless = new TelePickup(stratless);


        //that was not enuf. The great and powerful guitar god needed more raw power
        //Zeke decided to add a Humbucker pickup

        stratless = new Humbucker(stratless);

        //We could not stop their
        //MORE coolage
        //lets crank the cool to 11
        //lets add a pilot switch

        stratless = new PilotSwitchPickupSelector(stratless);


        //funk it lets add another tele pickup

        stratless = new TelePickup(stratless);

        System.out.print(stratless.getDescription()  +
                "This baby set me back $" + stratless.cost());

    }
}
