package poo_II.facade.sistemas;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SistemaAudio {
    
    private Clip clip;


    public void tocarMusicaFundo(){
        try {
            File arquivoAudio = new File("D:\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\facade\\audios\\track-sound-passenger-jet-flying-interior.wav");

            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(arquivoAudio));
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void pararAudio(){
        if(clip != null){
            clip.stop();
            clip.close();
        }
    }

    public void somDecolagem(){
        try {
            File arquivoAudio = new File("D:\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\facade\\audios\\track-airplane-take-off-large-airliner.wav");

            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(arquivoAudio));
            clip.start();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void somAterrissagem(){
        try {
            File arquivoAudio = new File("D:\\Documentos\\GitHub\\Java_cods\\Códigos\\poo_II\\facade\\audios\\track-airplane-distant-landing.wav");

            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(arquivoAudio));
            clip.start();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
