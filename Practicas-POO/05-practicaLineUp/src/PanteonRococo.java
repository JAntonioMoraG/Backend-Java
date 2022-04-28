import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class PanteonRococo extends Artista implements cancionesPanteon{
    public PanteonRococo(int id, String nombreGrupo, int numeroIntegrantes, int numeroCancionesATocar) {
        super(id, nombreGrupo, numeroIntegrantes, numeroCancionesATocar);
    }


    @Override
    public void presentacion(Screen s) {
        s.cls();
        s.out("\nHola mi gente Bonita\n");
        s.showImage("panteon.gif");
        s.setVisible(true);
    }

    @Override
    public void elultimoska(Screen s) {
        s.cls();
        s.out("\nSonando el ultimo Ska\n");
        s.showImage("panteon.gif");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/ultimoska.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido." +ex);
        }
    }

    @Override
    public void despedida(Screen s) {
        s.cls();
        s.out("\nNos vemos\n");
        s.showImage("panteon.gif");
    }
}
