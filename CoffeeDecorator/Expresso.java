package CoffeeDecorator;

public class Expresso implements Coffee {
    @Override 
    public int cost(){
        return 30;
    }

    @Override 
    public String description(){
        return "Expresso";
    }

}
