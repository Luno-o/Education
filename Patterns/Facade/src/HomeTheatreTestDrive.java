public class HomeTheatreTestDrive {
/*
Предоставляет унифицированный интерфейс к группе интерфейсов системы. Фасад определяет высокоуровневый интерфейс,
упрощающий работу с подсистемой.
Включает в себя принцип минимальной информированности(или закон Деметры, но это не верное название)
Общайтесь только с близкими друзьями.
Из метода объекта должны вызываться только методы, принадлежащие:

Самому объекту
Объектам, переданным в параметрах метода
Любому объекту, созданному внутри метода
Любым компонентам объекта

 */
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CDPlayer cdPlayer = new CDPlayer();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier,tuner, dvdPlayer,cdPlayer,projector,popper,screen,lights);
        homeTheaterFacade.watchMovie("Avengers");
        homeTheaterFacade.endMovie();
    }
}
