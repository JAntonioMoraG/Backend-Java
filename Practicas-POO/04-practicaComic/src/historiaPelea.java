public class historiaPelea extends Thread{
    Screen s;
    Sasuke sasuke;
    Naruto naruto;
    @Override
    public void run() {
        s.repaint();
        s.out("\nN: Tontoooo ya te dije que la venganza no es buena mata el alma y la envenena\n");
        s.showImage("narutonojao.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nN: Te voy a detener sasuke\n");
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("S: Intentaloo\n");
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("N: Lo Haree\n");
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.showImage("prepelea.png");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.repaint();
        naruto.lanzakunai(s);
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\nEso no es nada.....\n");
        sasuke.espada(s);
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        naruto.sustitucion(s);
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.showImage("preocupasasuke.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sasuke.chidori(s);
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        naruto.rasengan(s);
        s.showImage("narutorun.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        naruto.gritaSasuke(s);
        sasuke.gritaNaruto(s);
        s.showImage("corriendopelea.gif");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\n");
        s.showImage("pelea.gif");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.out("\n");
        s.showImage("fin.gif");
        s.out("\nCONTINUARA....................................");

    }

    public void pantalla(Screen s){
        this.s=s;
    }
    public void datosSasuke(Sasuke sasuke){
        this.sasuke=sasuke;
    }
    public void datosNaruto(Naruto naruto){
        this.naruto=naruto;
    }
}
