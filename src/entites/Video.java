package entites;

import interfaces.AbbassaLuminosità;
import interfaces.AumentaLuminosità;
import interfaces.Play;

public class Video extends ElementoMultimediale implements Play, AbbassaLuminosità, AumentaLuminosità {
    private int durata;
    private int volume;
    private int luminosita;


    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
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

    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }


    @Override
    public int start() {
        System.out.println("Stai ascoltando: " + titolo + " " + "- durata: " + durata + " " + "- volume: " + volume + " !".repeat(volume) + " " + "luminosità: " + luminosita + " *".repeat(luminosita));
        for (int i = 0; i < durata; i++) {
        }
        return 0;
    }

    @Override
    public int menoLuminosità() {
        return --luminosita;
    }

    @Override
    public int plusLuminosità() {
        return ++luminosita;
    }
}
