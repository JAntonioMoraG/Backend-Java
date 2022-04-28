public class monaMinion extends monaOriginal{
    String nombre="Mi nombre es Mona Minion";
    String color="Mi color es amarillo";
    monaMinion(){
        super.monaOriginal();
    }
    @Override
    void showDatos() {
        System.out.println(nombre);
        System.out.println(color);
    }
}
