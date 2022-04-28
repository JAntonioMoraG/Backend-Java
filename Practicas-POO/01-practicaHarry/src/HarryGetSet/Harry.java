package HarryGetSet;

public class Harry {
    public static void defHarry(){
        Personaje harry= new Personaje();
        harry.setNombre("Harry Potter");
        harry.setCasa("Gryffindor");
        harry.setGenero("Hombre");
        harry.setPureza("MESTIZO");
        harry.setPatronus("ciervo");
        harry.setBoggart("Dementor");
        harry.setVarita("acebo, nucleo de pluma de fenix");
        String msg="___________________________________________________________\n";
        msg+="Hola mi nombre es: "+harry.getNombre()+"\n";
        msg+="Mi genero es: "+harry.getGenero()+"\n";
        msg+="Soy de raza "+harry.getPureza()+"\n";
        msg+="Pertenezco a "+harry.getCasa()+"\n";
        msg+="Mi varita es de "+harry.getVarita()+"\n";
        msg+="Mi patronus es un(a) "+harry.getPatronus()+"\n";
        msg+="A lo que mas le tengo miedo es: "+harry.getBoggart();
        System.out.println(msg);
    }
}
