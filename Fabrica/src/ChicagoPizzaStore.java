public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("Clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }


}
