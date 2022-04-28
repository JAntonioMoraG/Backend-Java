import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class ValentinElizalde extends Artista implements cancionesValentin{
    public ValentinElizalde(int id, String nombreArtista, int numeroCancionesATocar) {
        super(id, nombreArtista, numeroCancionesATocar);
    }

    @Override
    public void presentacion(Screen s) {
        s.cls();
        s.out("\nHola mi gente chula del TonyFest!!!!!\n");
        s.out("Yo soy el gallo de oro\n ");
        s.setVisible(true);
    }

    @Override
    public void tocarAMisEnemigos(Screen s) {
        s.cls();
        s.out("\nSonando a mis enemigos\n");
        s.showImage("valentin.gif");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/amisenemigos.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido." +ex);
        }
    }

    @Override
    public void subirMuchachaABailar(Screen s) {
        s.repaint();
        s.out("\nSE SUBIO A BAILA CON EL GALLO DE ORO ");
    }

    @Override
    public void tocarTeQuieroAsi(Screen s) {
        s.out("\nSonando te quiero asi\n");
        s.showImage("valentin.gif");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/tequieroasi.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido." +ex);
        }
    }

    @Override
    public void beberTequila(Screen s) {
        s.out("\nFondoooooooooooooo");
    }

    @Override
    public void tocarVeteYa(Screen s) {
        s.cls();
        s.out("\nSonando Vete YA\n");
        s.showImage("valentin.gif");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/veteya.wav").getAbsoluteFile());
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
        s.out("\nNos vemos GENTEEEEEEEEEEEEE");
    }
}
