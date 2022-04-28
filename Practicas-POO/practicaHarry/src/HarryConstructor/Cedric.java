package HarryConstructor;

public class Cedric {
    public static void showCedric(){
        Personaje cedric=new Personaje("cedric diggory","hombre","hufflepuff",
                "fresno, nucleo de pelo de unicornio","puro","voldemort");
        System.out.println("********************************************************************");
        System.out.println(cedric.getNombre().toUpperCase());
        System.out.println(cedric.getPureza().toUpperCase());
        System.out.println("Genero: "+cedric.getGenero().toUpperCase());
        System.out.println("Casa: "+cedric.getCasa().toUpperCase());
        System.out.println("Varita de "+cedric.getVarita().toUpperCase());
        System.out.println("Mi mayor miedo es: "+cedric.getBoggart().toUpperCase());
    }
}
