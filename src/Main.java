import entites.RegistrazioneAudio;
import entites.Video;

public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio song = new RegistrazioneAudio("Titolo traccia", 1, 10);
        System.out.println("Test Volume");
        song.start();
        song.menoVolume();
        song.start();
        song.plusVolume();
        song.start();
        song.menoVolume();
        song.start();
        song.menoVolume();
        song.start();
        song.plusVolume();
        song.start();
        song.plusVolume();
        Video grafica = new Video("Titolo traccia", 1, 10, 10);
        grafica.start();
        grafica.menoLuminosità();
        grafica.start();
        grafica.menoLuminosità();
        grafica.start();
        grafica.plusLuminosità();
        grafica.start();
        grafica.menoLuminosità();
        grafica.start();
        grafica.plusLuminosità();


    }
}