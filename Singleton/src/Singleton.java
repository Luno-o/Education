
/*
Одиночка гарантирует, что класс имеет только один экземпляр и предоставляет глобальную точку доступа
к этому экземпляру.

НИже метод условной блокировки
Так же есть метод синхронизации метода и раннее создание экземпляра
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;  //volatile гарантирует, что параллельные программные потоки будут правильно работать при ее инициализации экземпляром Singleton
    private Singleton(){
    }
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
