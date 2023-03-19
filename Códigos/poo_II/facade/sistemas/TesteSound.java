package poo_II.facade.sistemas;

import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TesteSound {
    public static void main(String[] args) {
        String frase = "Iniciando decolagem!!";

        try {
            File arquivoAudio = new File("C:\\Users\\heith\\OneDrive\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\facade\\audios\\track-airplane-take-off-large-airliner.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(arquivoAudio));

            for(int i = 0; i < frase.length(); i++){
                System.out.print(frase.charAt(i));
                Thread.sleep(67);   
            }

            Thread.sleep(500);

            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


}
