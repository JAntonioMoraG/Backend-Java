public class historiaSasuke extends Thread{
    Sasuke sasuke;
    Screen s;
    @Override
    public void run() {
        s.repaint();
        s.out(" Soy "+sasuke.getNombre()+"\n");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("Desde niño siempre fui un prodigio\n");
        sasuke.katon(s);
        s.showImage("katon.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nSoy el unico sobreviviente del clan "+sasuke.getClan()+"\n");
        s.showImage("uchiha.jpeg");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nEramos un clan muy poderoso y temido por nuestro odio y principalmente por nuestros ojos....\n");
        s.out("El Sharingan\n");
        s.showImage("sharingan.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nPero todos fueron asesinados por mi hermano Itachi Uchiha y solo me dejo vivo a mi \n");
        s.showImage("itachi.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nLo odio y lo matare para vengar a mi clan\n");
        s.showImage("itachisasu.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\n"+sasuke.getRango()+" de konoha y me fui con orochimaru\n");
        s.showImage("orochimaru.jpg");
        s.out("\nY me fui solo para tener mas poder jajajaja \n");
        s.showImage("sasukepoder.gif");
        s.out("\n Aunque el tonto de NAruto siempre intenta detenerme...\n");
        s.showImage("sasukenojao.gif");

    }

    public void pantalla(Screen s){
        this.s=s;
    }
    public void datosSasuke(Sasuke sasuke){
        this.sasuke=sasuke;
    }

}