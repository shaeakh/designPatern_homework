package Pizza_Toppings;

public class Main {
    public static void main(String[] args) {

        // Creating a Pepperoni pizza and adding toppings
        Pizza pepperoni = new Pepperoni_Pizza();
        pepperoni.prepare();
        pepperoni.addTopping("SOS");
        pepperoni.addTopping("Chicken");
        pepperoni.addTopping("Chese");


        System.out.println();

        // Creating Vegetarian pizza and adding toppings
        Pizza vegetarian = new VegPizza();
        vegetarian.prepare();
        vegetarian.addTopping("cheese");
        vegetarian.addTopping("tomato");
        vegetarian.addTopping("vegetables");

    }
}
