package CoffeeDecorator;

public abstract  class Condiment implements  Coffee{

    protected  Coffee coffee;
    public  Condiment(Coffee coffee){
        this.coffee = coffee;
    }
 
}
