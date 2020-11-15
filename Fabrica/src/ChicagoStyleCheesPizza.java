public class ChicagoStyleCheesPizza extends Pizza {
    ChicagoStyleCheesPizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thin crust dough";
        sauce = "Plun tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cuting pizza into square slices");
    }

}