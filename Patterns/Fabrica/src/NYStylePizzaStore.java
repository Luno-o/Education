public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesPizza(pizzaIngredientFactory);
            pizza.setName("NY style Cheese pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
pizza.setName("NY style Veggie pizza");
        }else if (item.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("NY style Clam Pizza");
        }else if (item.equals("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("NY style pepperoni Pizza");
        }return pizza;
    }

}
