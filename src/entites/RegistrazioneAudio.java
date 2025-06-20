package entites;

import interfaces.AbbassaVolume;
import interfaces.AumentaVolume;
import interfaces.Play;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, AbbassaVolume, AumentaVolume {
    private int durata;
    private int volume;


    public RegistrazioneAudio(String titolo, int durata, int volume) {
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

    }


    @Override
    public int start() {
        System.out.println("Stai ascoltando: " + titolo + " " + "- durata: " + durata + " " + "- volume: " + volume + " !".repeat(volume));
        for (int i = 0; i < durata; i++) {
        }
        return 0;
    }

    @Override
    public int menoVolume() {
        return --volume;

    }

    @Override
    public int plusVolume() {
        return ++volume;

    }
}
