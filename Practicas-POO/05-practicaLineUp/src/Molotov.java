import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Molotov extends Artista implements cancionesMolotov{
    public Molotov(int id, String nombreGrupo, int numeroIntegrantes, int numeroCancionesATocar) {
        super(id, nombreGrupo, numeroIntegrantes, numeroCancionesATocar);
    }

    @Override

    public void frijolero(Screen s) {
        s.cls();
        s.out("\nSonando frijolero\n");
        s.showImage("molotov.gif");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/frijolero.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido." +ex);
        }
    }

    @Override
    public void presentacion(Screen s) {
        s.cls();
        s.out("\nHola RAZAAAAAAA\n");
        s.showImage("molotov.gif");
        s.setVisible(true);
    }

    @Override
    public void despedida(Screen s) {
        s.cls();
        s.out("\nnos vemos RAZAAAAAAA\n");
        s.showImage("molotov.gif");
        s.setVisible(true);
    }
}
