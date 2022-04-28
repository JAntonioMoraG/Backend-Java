public class Sasuke extends Ninja implements sasukeMovements{

    public Sasuke(String nombre, String aldea, String clan, String rango) {
        super(nombre, aldea, clan, rango);
    }

    @Override
    public void katon(Screen s) {
        s.repaint();
        s.out("\nkaton goukakyuu no jutsu !!!!! \n","Helvetica",16,Colors.BLACK);
    }

    @Override
    public void chidori(Screen s) {
        s.repaint();
        s.out(" \nChidoriiiiii \n","Helvetica",16,Colors.BLACK);
        s.showImage("chidori.gif");
    }

    @Override
    public void espada(Screen s) {
        s.repaint();
        s.out("\nespada fiuuuuuuu!!!!\n","Helvetica",16,Colors.BLACK);
        s.showImage("sasukeespada.gif");
    }

    @Override
    public void gritaNaruto(Screen s) {
        s.repaint();
        s.out("S: NARUTOOOOOOOOOOOOOOOOOOOOOOOO\n","Helvetica",16,Colors.BLACK);
    }
}
