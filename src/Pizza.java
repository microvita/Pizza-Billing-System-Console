public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 200;
    private int extraToppingPrice = 250;
    private int backPackPrice = 100;

    private int basePizzaPrice;

    private Boolean extraCheeseAdded = false;
    private Boolean extraToppingAdded = false;
    private Boolean extraBackPackAdded = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        this.extraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraTopping(){
        this.extraToppingAdded = true;
        this.price += extraToppingPrice;
    }

    public void addTakeAway(){
        this.extraBackPackAdded = true;
        this.price += backPackPrice;
    }

    public void getBill(){
        String bill  = "";
        if(this.extraCheeseAdded){
            bill += "Extra Cheese added : " +extraCheesePrice+ "\n";
        }
        if(this.extraToppingAdded){
            bill += "Extra Topping added : " +extraToppingPrice+ "\n";
        }
        if(this.extraBackPackAdded){
            bill += "Take Away added : " +backPackPrice+ "\n";
        }

        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}

/*
* Base Pizza = 500;
* Extra Cheese = 200;
* Extra Topping = 250;
* Extra Back Pack = 100;
* */