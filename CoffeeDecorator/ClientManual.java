package CoffeeDecorator;

public class ClientManual {
    
    public  static  void  main(String[] args){
        Coffee coffee = new Expresso();

        coffee = new Milk(coffee);
        coffee = new Whip(coffee);
        System.out.println("Order :" + coffee.description());
        System.out.println("Cost :" + coffee.cost() );
        
    }
}
