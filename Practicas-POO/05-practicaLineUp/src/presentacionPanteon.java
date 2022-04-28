public class presentacionPanteon extends Thread{
    Screen s;
    @Override
    public void run() {
        PanteonRococo pr=new PanteonRococo(2,"Panteon Rococo",8,1);
        pr.presentacion(s);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pr.elultimoska(s);
        try {
            Thread.sleep(270000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pr.despedida(s);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void pantala(Screen s){
        this.s=s;
    }
}
