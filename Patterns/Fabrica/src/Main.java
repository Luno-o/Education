public class Main {/*
Определяет интерфейс создания объекта, но позволяет субклассам выбрать класс создаваемого экземпляра.
Фабричный метод делегирует операцию создания экземпляра классам субклассам.
Код должен зависеть от абстракций, а не конкретных классов

Абстрактная фабрика предоставляет интерфейс создания семейств взаимосаязанных или взаимозависимых объектов без
указания их конкретных классов.


*/
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered  a "+ pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
