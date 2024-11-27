package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Light light = new Light();
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(light, projector, dvdPlayer);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
