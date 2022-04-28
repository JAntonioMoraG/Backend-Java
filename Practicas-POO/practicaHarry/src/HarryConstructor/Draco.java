package HarryConstructor;

public class Draco {
    public static void showDraco(){
        Personaje draco=new Personaje("draco malfoy","hombre","slytherin",
                "espino, nucleo de pelo de unicornio","puro","bosque prohibido");
        System.out.println("********************************************************************");
        System.out.println(draco.getNombre().toUpperCase());
        System.out.println(draco.getPureza().toUpperCase());
        System.out.println("Genero: "+draco.getGenero().toUpperCase());
        System.out.println("Casa: "+draco.getCasa().toUpperCase());
        System.out.println("Varita de "+draco.getVarita().toUpperCase());
        System.out.println("Mi mayor miedo es: "+draco.getBoggart().toUpperCase());
    }
}
