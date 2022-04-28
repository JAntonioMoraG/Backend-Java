public class presentacionValentin extends Thread{
    Screen s;
    @Override
    public void run() {
        ValentinElizalde ve=new ValentinElizalde(3,"Valentin Elizalde",3);
        ve.presentacion(s);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ve.tocarTeQuieroAsi(s);
        try {
            Thread.sleep(153400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ve.beberTequila(s);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ve.tocarVeteYa(s);
        try {
            Thread.sleep(147000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ve.tocarAMisEnemigos(s);
        try {
            Thread.sleep(189000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ve.despedida(s);

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
