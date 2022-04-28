public class main {
    public static void main(String[] args) {
        monaOriginal mona=new monaOriginal();
        mona.showDatos();
        System.out.println("**** VARIANTE NUMERO 1 ****");
        mona=new monaMinion();
        mona.showDatos();
        System.out.println("**** VARIANTE NUMERO 2 ****");
        mona= new monaIronman();
        mona.showDatos();
        System.out.println("**** VARIANTE NUMERO 3 ****");
        mona=new monaNinja();
        mona.showDatos();
        System.out.println("**** VARIANTE NUMERO 4 ****");
        mona=new monaFinn();
        mona.showDatos();
        System.out.println("**** VARIANTE NUMERO 5 ****");
        mona=new monaBox();
        mona.showDatos();
        System.out.println("**** VARIANTE NUMERO 6 ****");
        mona= new monaHomer();
        mona.showDatos();
    }
}
