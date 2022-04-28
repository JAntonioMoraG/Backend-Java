package HarryGetSet;

public class Hermione {
    public static void defHermione(){
        Personaje hermione= new Personaje();
        hermione.setNombre("Hermione");
        hermione.setCasa("Gryffindor");
        hermione.setGenero("Mujer");
        hermione.setPureza("sangre sucia");
        hermione.setPatronus("Nutria");
        hermione.setBoggart("Profesora McGonagall");
        hermione.setVarita("vid, nucleo de fibra de corazon de dragon");
        String msg="___________________________________________________________\n";
        msg+="Hola mi nombre es: "+hermione.getNombre()+"\n";
        msg+="Mi genero es: "+hermione.getGenero()+"\n";
        msg+="Soy de raza "+hermione.getPureza()+"\n";
        msg+="Pertenezco a "+hermione.getCasa()+"\n";
        msg+="Mi varita es de "+hermione.getVarita()+"\n";
        msg+="Mi patronus es un(a) "+hermione.getPatronus()+"\n";
        msg+="A lo que mas le tengo miedo es: "+hermione.getBoggart();
        System.out.println(msg);
    }
}
