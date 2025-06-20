package entites;

import interfaces.AbbassaLuminosità;
import interfaces.AumentaLuminosità;

public class Immagine extends ElementoMultimediale implements AumentaLuminosità, AbbassaLuminosità {
    public int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;

    }

    @Override
    public int menoLuminosità() {
        return --luminosità;
    }

    @Override
    public int plusLuminosità() {
        return ++luminosità;
    }

    public void show() {
        System.out.println("Stai vedendo: " + titolo + " " + "luminosità: " + luminosità + " *".repeat(luminosità));
    }
}
