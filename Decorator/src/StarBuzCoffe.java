import java.io.*;

public class StarBuzCoffe { // Динамически наделяет объект новыми возмодностями, является гибкой альтернативой субклассированию
    //в области расширения функциональности.
/*
Декоратор применяется для IO java, использует много оберток.
Классы должны быть открыты для расширения, но закрыты для изменения.

 */
    public static void main(String[] args) throws IOException{
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage1 = new DarcRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
