public class monaBox extends monaOriginal{
    String nombre="Mi nombre es Mona BoxertoCat";
    monaBox(){
        monaOriginal();
    }

    @Override
    void showDatos() {
        System.out.println(nombre);
        System.out.println(super.color);
        System.out.println("Soy mona la Boxeaadora xd");
    }
}
