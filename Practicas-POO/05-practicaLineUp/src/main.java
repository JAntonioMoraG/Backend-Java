public class main {
    public static void main(String[] args) throws InterruptedException {
        Screen s=new Screen();
        Screen s2=new Screen();
        s.setTitle("Escenario 1");
        s2.setTitle("Escenario 2");
        presentacionValentin pv=new presentacionValentin();
        presentacionPanteon pp= new presentacionPanteon();
        presentacionMolotov pm=new presentacionMolotov();
        presentacionStaff ps=new presentacionStaff();
        presentacionStaff ps2=new presentacionStaff();
        ps.pantala(s);
        ps2.pantala(s2);
        pm.pantala(s);
        pv.pantala(s);
        pp.pantala(s2);
        ps.start();
        ps2.start();
        ps.join();
        pm.start();
        pm.join();
        pp.start();
        pp.join();
        pv.start();
    }
}
