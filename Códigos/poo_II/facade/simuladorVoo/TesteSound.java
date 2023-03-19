package poo_II.facade.simuladorVoo;

import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TesteSound {
    public static void main(String[] args) {
        ArrayList<Character> letras = new ArrayList<>();
        String frase = "Iniciando decolagem!!";
        
        for(int i = 0; i < frase.length(); i++){
            letras.add(frase.charAt(i));    
        }

        try {
            File arquivoAudio = new File("D:\\Audios\\track-airplane-take-off-large-airliner.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(arquivoAudio));

            for (Character character : letras) {
                System.out.print(character);
                Thread.sleep(67);
            }

            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


}
