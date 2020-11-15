public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory ;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        name = "Veggie";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name );
        dough = ingredientFactory.createDough();
        veggies = ingredientFactory.createVeggies();

    }
}
