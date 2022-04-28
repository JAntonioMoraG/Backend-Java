public class Staff implements accionesStaff{
    @Override
    public void iniciando(Screen s) {
        s.cls();
        s.out("INICIAMOS EN BREVE");
        s.setVisible(true);

    }
}
