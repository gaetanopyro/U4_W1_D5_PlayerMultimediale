package entites;

public class Video extends ElementoMultimediale {
    private int durata;
    private int volume;


    public Video(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        if (durata > 0) {
            this.durata = durata;
        } else {
            System.out.println("Durata inesistente");
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Volume assente");
        }
        ;
    }
}
