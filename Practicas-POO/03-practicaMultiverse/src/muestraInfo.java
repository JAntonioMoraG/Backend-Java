public class muestraInfo extends Spiderman implements poderesSpiderman{
    public muestraInfo(int id, String planeta, String nombreSpider, String nombreReal, String tipoTraje, String descripcion) {
        super(id, planeta, nombreSpider, nombreReal, tipoTraje, descripcion);
    }

    public void MostrarDatos(Screen s){
        s.setVisible(true);
        s.setTitle("Spiderman");
        s.out(showMessage(),"Helvetica",25,Colors.RED);
    }
    public void spider616Image(Screen s){
        s.repaint();
        s.showImage("spider616.jpeg");
    }
    public void spiderMilesImage(Screen s){
        s.repaint();
        s.showImage("spidermiles.jpeg");
    }
    public void spiderGirlImage(Screen s){
        s.repaint();
        s.showImage("spidergirl.jpg");
    }
    @Override
    public void lanzarTelarana(Screen s) {
        s.repaint();
        s.out("\nAtaque: lanzo una telaraña\n","Helvetica",25,Colors.RED);
        }

    @Override
    public void punzada(Screen s) {
        s.out("\nAtaque: Hay peligro cerca\n","Helvetica",25,Colors.RED);
    }

    @Override
    public void treparMuros(Screen s) {
        s.repaint();
        s.out("\nAtaque: Se subio a un muro\n","Helvetica",25,Colors.RED);
    }

    @Override
    public void columpiarse(Screen s) {
        s.repaint();
        s.out("\nAtaque: Se columpió\n","Helvetica",25,Colors.RED);

    }
}
