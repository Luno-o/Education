public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CDPlayer cdPlayer;
    Projector projector;
    PopcornPopper popcornPopper;
    Screen screen;
    TheaterLights theaterLights;
    public HomeTheaterFacade(Amplifier amplifier,Tuner tuner,DvdPlayer dvdPlayer,
                             CDPlayer cdPlayer,Projector projector, PopcornPopper popcornPopper,
                             Screen screen,TheaterLights theaterLights){
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.popcornPopper = popcornPopper;
        this.screen = screen;
        this.theaterLights = theaterLights;
    }
    public void watchMovie(String movie){
        System.out.println("Приготовьтесь смотреть " + movie);
popcornPopper.on();
popcornPopper.pop();
theaterLights.dim(10);
screen.down();
projector.on();
projector.wideScreenMode();
amplifier.on();
amplifier.setDvd(dvdPlayer);
amplifier.setSurroundSound();
amplifier.setVolume(10);

    }
    void endMovie(){
        System.out.println("Сворачиваем кинотеатр");
popcornPopper.off();
theaterLights.on();
screen.up();
projector.off();
amplifier.off();
    }
}
