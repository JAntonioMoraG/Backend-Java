package HarryConstructor;

public class Luna {
    public static void showLuna(){
        Personaje luna=new Personaje("luna lovegood","mujer","ravenclaw",
                "cedro, nucleo de fibra de corazon de dragon","mestiza","Ver morir a mi padre",
                "liebre");
        System.out.println("********************************************************************");
        System.out.println(luna.getNombre().toUpperCase());
        System.out.println(luna.getPureza().toUpperCase());
        System.out.println("Genero: "+luna.getGenero().toUpperCase());
        System.out.println("Casa: "+luna.getCasa().toUpperCase());
        System.out.println("Varita de "+luna.getVarita().toUpperCase());
        System.out.println("Mi mayor miedo es: "+luna.getBoggart().toUpperCase());
        System.out.println("Mi patronus: "+luna.getPatronus().toUpperCase());
    }
}
