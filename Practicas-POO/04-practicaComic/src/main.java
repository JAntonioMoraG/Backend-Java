public class main{
    public static void main(String[] args)  {
        Screen s = new Screen();
        Naruto naruto=new Naruto("Naruto Uzumaki","konoha","Uzumaki","genin");
        Sasuke sasuke=new Sasuke("Sasuke Uchiha","Konoha","Uchiha","soy desterrado");
        historiaNAruto hn=new historiaNAruto();
        historiaSasuke hs=new historiaSasuke();
        historiaPelea hp=new historiaPelea();
        hn.datosNaruto(naruto);
        hs.datosSasuke(sasuke);
        hp.datosNaruto(naruto);
        hp.datosSasuke(sasuke);
        hn.pantalla(s);
        hs.pantalla(s);
        hp.pantalla(s);
        hn.start();
        try {
            hn.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hs.start();
        try {
            hs.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hp.start();
    }
}