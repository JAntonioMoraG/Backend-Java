public class monaIronman extends monaOriginal{
    String color="Mi color es amarillo con rojo";
    String nombre="Mi nombre es Mona Ironcat";
    monaIronman(){
        super.monaOriginal();
    }

    @Override
    void showDatos() {
        System.out.println(nombre);
        System.out.println(color);
        System.out.println("Mi habilidad es que mute de ironman y tengo sus poderes");
    }
}
