import entites.RegistrazioneAudio;

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


    }
}