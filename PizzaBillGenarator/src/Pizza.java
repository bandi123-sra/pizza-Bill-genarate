public class Pizza
{
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingseAdded=false;
    private boolean isOptedForTakeAway= false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtracheese() {
        isExtraCheeseAdded=true;

        this.price +=extraCheesePrice;
    }
     public void  addExtraToppings(){
        isExtraToppingseAdded=true;

        this.price +=extraToppingsPrice;


    }
    public void takeAway(){
        isOptedForTakeAway=true;

        this.price +=backPackPrice;

    }
    public void getBill(){
        System.out.println(this.price);
    }

    public void getbill(){
        String bill="";
        System.out.println("Pizza:"+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill +="Extra cheese added:"+extraCheesePrice+"\n";

        }
        if(isExtraToppingseAdded){
            bill +="Extra Toppinges added:"+extraToppingsPrice+"\n";

        }
        if(isExtraToppingseAdded){
            bill +="Take away:"+backPackPrice+"\n";

        }
      bill +="Bill:"+this.price+"\n";
        System.out.println(bill);
    }
}









