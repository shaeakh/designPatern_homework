package Pizza_Toppings;
public class VegPizza extends Pizza {
    @Override
    public void addTopping(String topping) {
        System.out.println("Adding " + topping + " to Vegetarian pizza");
    }
}
