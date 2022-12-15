package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;
    boolean isCheesePriceAdded;
    boolean isToppingPriceAdded;
    boolean isTakeAwayPriceAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice=80;
        this.takeAwayPrice=20;
        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;
        }else{
            this.price=400;
            this.toppingPrice=120;
        }
        this.isCheesePriceAdded=false;
        this.isTakeAwayPriceAdded=false;
        this.isToppingPriceAdded=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheesePriceAdded==false){
            this.price=this.price+this.cheesePrice;
            isCheesePriceAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingPriceAdded==false){
            this.price=this.price+this.toppingPrice;
            isToppingPriceAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayPriceAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayPriceAdded=true;
        }
    }

    public String getBill(){

        if(isBillGenerated==false){

            if(isCheesePriceAdded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingPriceAdded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(isTakeAwayPriceAdded==true){
                this.bill=this.bill+"Paperbag Added: "+this.takeAwayPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";

            isBillGenerated=true;

        }
        return this.bill;
    }
}
