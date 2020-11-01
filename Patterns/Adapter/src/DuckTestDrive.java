public class DuckTestDrive {

    // Преобразует интерфейс класса к другому интерфейсу, на который рассчитан клиент
    // Обеспечивает работу классов, невозможную в обычных условиях из-за несовместимости интерфейсов
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says  ");
        testDuck(duck);

        System.out.println("\nThe turkey adapter says  ");
        testDuck(turkeyAdapter);
    }
    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
