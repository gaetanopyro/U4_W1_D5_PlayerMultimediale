import entites.ElementoMultimediale;
import entites.Immagine;
import entites.RegistrazioneAudio;
import entites.Video;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        System.out.println("Digita 0 per Registrazione Audio, 1 per Video, 2 per Immagine.");

        int i = 0;
        while (i < 5) {
            System.out.println("Inserisci il nome del file multimediale " + (i + 1) + " - scegli il tipo:");
            String text = scanner.nextLine();

            if (text.equals("0") || text.equals("1") || text.equals("2")) {
                int tipo = Integer.parseInt(text);

                if (tipo == 0) {
                    System.out.println("Titolo traccia:");
                    String titolo = scanner.nextLine();
                    System.out.println("Durata:");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("Volume:");
                    int volume = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
                } else if (tipo == 1) {
                    System.out.println("Titolo:");
                    String titolo = scanner.nextLine();
                    System.out.println("Durata:");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("Volume:");
                    int volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Luminosità:");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, durata, volume, luminosita);
                } else {
                    System.out.println("Titolo:");
                    String titolo = scanner.nextLine();
                    System.out.println("Luminosità:");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, luminosita);
                }
                i++;
            } else {
                System.out.println(" riprova.");
            }
            scanner.close();
        }
    }
}

      /*  RegistrazioneAudio song = new RegistrazioneAudio("Titolo traccia", 1, 10);
        System.out.println("Test Volume");
        song.start();
        song.menoVolume();
        song.start();
        song.plusVolume();
        song.start();
        song.menoVolume();
        song.start();
        song.menoVolume();
        System.out.println("Test Video");
        Video grafica = new Video("Titolo traccia", 1, 10, 10);
        grafica.start();
        grafica.menoLuminosità();
        grafica.start();
        grafica.menoLuminosità();
        grafica.start();
        grafica.plusLuminosità();
        grafica.start();
        grafica.menoLuminosità();
        System.out.println("Test Immagine");
        Immagine img = new Immagine("Album:", 10);
        img.show();
        img.menoLuminosità();
        img.show();
        img.plusLuminosità();
        img.show();
        img.menoLuminosità();
        img.show();
        img.plusLuminosità();

       */




