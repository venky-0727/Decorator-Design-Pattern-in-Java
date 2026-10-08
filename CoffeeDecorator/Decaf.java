package CoffeeDecorator;

public class Decaf implements Coffee {

    @Override
    public int cost() {
        return 50;
    }

    @Override
    public String description() {
     
        return "Decaf";
    }

    
    
}
