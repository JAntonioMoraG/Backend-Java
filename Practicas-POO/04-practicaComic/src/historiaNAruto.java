import javax.swing.plaf.nimbus.State;

import static java.lang.Thread.sleep;

public class historiaNAruto extends Thread{
    Screen s;
    Naruto naruto;
    @Override
    public void run() {

        s.out("Esta es la historia de Naruto vs Sasuke\n");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.setVisible(true);
        s.repaint();
        s.out("Hola mi nombre es "+naruto.getNombre()+"\n");
        s.showImage("naruto.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nPertenezco a un clan llamado "+ naruto.getClan()+"\n");
        s.showImage("uzumaki.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nSoy de la aldea de "+naruto.getAldea()+"\n");
        s.showImage("konoha.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\ny aunque aun soy "+naruto.getRango());
        s.out(" mi sueño es ser hokage y que toda la aldea me reconozca"+"\n");
        s.showImage("hokague.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nAunque es algo muy dificil porque dentro de mi vive un zorro que destruyo la aldea antes\n");
        s.showImage("kyuubi.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\ny tambien mato a mis padres :c\n");
        s.showImage("minatokushina.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\ny por eso toda la aldea me rechaza y aun asi pude conseguir amigos\n");
        s.showImage("11konoha.png");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nAunque falta uno muy especial\n");
        s.showImage("narusas.jpeg");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nel se llama Sasu........\n");
        s.showImage("sasuke.gif");
        s.out("\nS: Hey tonto dejame contar mi historia\n");

    }
    public void pantalla(Screen s){
        this.s=s;
    }
    public void datosNaruto(Naruto naruto){
        this.naruto=naruto;
    }
}