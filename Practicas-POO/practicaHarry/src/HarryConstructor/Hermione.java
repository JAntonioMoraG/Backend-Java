package HarryConstructor;

public class Hermione {
    public static void showHermione(){
        Personaje hermione=new Personaje("Hermione","Mujer","Gryffindor",
                "vid, nucleo de fibra de corazon de dragon","sangre sucia","Profesora McGonnagall",
                "nutria");
        System.out.println("********************************************************************");
        System.out.println(hermione.getNombre().toUpperCase());
        System.out.println(hermione.getPureza().toUpperCase());
        System.out.println("Genero: "+hermione.getGenero().toUpperCase());
        System.out.println("Casa: "+hermione.getCasa().toUpperCase());
        System.out.println("Varita de "+hermione.getVarita().toUpperCase());
        System.out.println("Mi mayor miedo es: "+hermione.getBoggart().toUpperCase());
        System.out.println("Mi patronus: "+hermione.getPatronus().toUpperCase());
    }
}
