public class monaNinja extends monaOriginal{
    String nombre="Mi nombre es Mona Dojocat";
    String accesorio="Tengo una espada";
    monaNinja(){
        super.monaOriginal();
    }

    @Override
    void showDatos() {
        System.out.println(nombre);
        System.out.println(super.color);
        System.out.println("Soy un michi ninja");
        System.out.println(accesorio);
    }
}
