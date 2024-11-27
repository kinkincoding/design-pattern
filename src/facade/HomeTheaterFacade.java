package facade;

public class HomeTheaterFacade {
    Light light;
    Projector projector;
    DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Light light, Projector projector, DvdPlayer dvdPlayer) {
        this.light = light;
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie() {
        light.off();
        projector.on();
        dvdPlayer.on();
    }

    public void endMovie() {
        dvdPlayer.off();
        projector.off();
        light.on();
    }
}
