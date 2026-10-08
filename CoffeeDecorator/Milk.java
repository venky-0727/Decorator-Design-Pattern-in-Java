package CoffeeDecorator;

public class Milk extends Condiment {
    public  Milk (Coffee coffee) {
        super(coffee);
    }

    @Override 
    public int cost(){
        return coffee.cost() + 30 ;
    }
    
    @Override 
    public String description() {
        return coffee.description() + "+ Milk" ;
        
    }

    
}
