public class Naruto extends Ninja implements narutoMovements{
    public Naruto(String nombre, String aldea, String clan, String rango) {
        super(nombre, aldea, clan, rango);
    }

    @Override
    public void rasengan(Screen s) {
        s.repaint();
        s.out("\nRasengaaaaaaaan\n","Helvetica",16,Colors.BLACK);
    }

    @Override
    public void lanzakunai(Screen s) {
        s.repaint();
        s.out("kunai fiuuuuuuu!!!!\n","Helvetica",16,Colors.BLACK);
        s.showImage("narutokunai.jpeg");

    }

    @Override
    public void sustitucion(Screen s) {
        s.repaint();
        s.out("\n¡se sustituyo por un tronco!\n","Helvetica",16,Colors.BLACK);
        s.showImage("sustitucion-naruto.gif");

    }

    @Override
    public void gritaSasuke(Screen s) {
        s.repaint();
        s.out("\nN: SASUKEEEEEEEEEEEEEEEEEEEE\n","Helvetica",16,Colors.BLACK);
    }

}