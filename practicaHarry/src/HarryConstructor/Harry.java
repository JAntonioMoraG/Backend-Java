package HarryConstructor;

public class Harry {
    public static void showHarry(){
        Personaje harry=new Personaje("Harry Potter","hombre","Gryffindor",
                "acebo, nucleo de pluma de fenix","mestizo","dementor",
                "ciervo");
        System.out.println("********************************************************************");
        System.out.println(harry.getNombre().toUpperCase());
        System.out.println(harry.getPureza().toUpperCase());
        System.out.println("Genero: "+harry.getGenero().toUpperCase());
        System.out.println("Casa: "+harry.getCasa().toUpperCase());
        System.out.println("Varita de "+harry.getVarita().toUpperCase());
        System.out.println("Mi mayor miedo es: "+harry.getBoggart().toUpperCase());
        System.out.println("Mi patronus: "+harry.getPatronus().toUpperCase());
    }
}
