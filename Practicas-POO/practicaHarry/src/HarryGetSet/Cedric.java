package HarryGetSet;

public class Cedric {
    public static void defCedric(){
        Personaje cedric=new Personaje();
        cedric.setNombre("Cedric Diggory");
        cedric.setGenero("Hombre");
        cedric.setCasa("Hufflepuff");
        cedric.setBoggart("lord Voldemort");
        cedric.setPureza("puro");
        cedric.setPatronus("No se porque me mori :c");
        cedric.setVarita("fresno, nucleo de pelo de unicornio");
        String msg="___________________________________________________________\n";
        msg+="Hola mi nombre es: "+cedric.getNombre()+"\n";
        msg+="Mi genero es: "+cedric.getGenero()+"\n";
        msg+="Soy de raza "+cedric.getPureza()+"\n";
        msg+="Pertenezco a "+cedric.getCasa()+"\n";
        msg+="Mi varita es de "+cedric.getVarita()+"\n";
        msg+="Mi patronus es un(a) "+cedric.getPatronus()+"\n";
        msg+="A lo que mas le tengo miedo es: "+cedric.getBoggart();
        System.out.println(msg);
    }
}
