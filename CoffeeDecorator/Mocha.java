package CoffeeDecorator;

public class Mocha extends Condiment {

    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 100;
    }

    @Override
    public String description() {
        return coffee.description() + " + Mocha";
    }
}

