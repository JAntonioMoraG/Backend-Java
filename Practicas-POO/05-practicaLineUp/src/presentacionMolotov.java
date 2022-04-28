public class presentacionMolotov extends Thread{
    Screen s;

    @Override
    public void run() {
        Molotov m=new Molotov(3,"Molotov",4,1);
        m.presentacion(s);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.frijolero(s);
        try {
            Thread.sleep(204000);//204000
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.despedida(s);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pantala(Screen s){
        this.s=s;
    }
}
