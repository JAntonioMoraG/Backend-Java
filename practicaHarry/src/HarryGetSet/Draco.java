package HarryGetSet;
public class Draco {
    public static void defDraco() {
        Personaje draco = new Personaje();
        draco.setNombre("Draco Malfoy");
        draco.setGenero("Hombre");
        draco.setPureza("Puro");
        draco.setPatronus("No tengo por malo :c");
        draco.setCasa("Slytherin");
        draco.setBoggart("El bosque prohibido");
        draco.setVarita("espino, nucleo de pelo de unicornio");
        String msg="___________________________________________________________\n";
        msg+="Hola mi nombre es: "+draco.getNombre()+"\n";
        msg+="Mi genero es: "+draco.getGenero()+"\n";
        msg+="Soy de raza "+draco.getPureza()+"\n";
        msg+="Pertenezco a "+draco.getCasa()+"\n";
        msg+="Mi varita es de "+draco.getVarita()+"\n";
        msg+="Mi patronus es un(a) "+draco.getPatronus()+"\n";
        msg+="A lo que mas le tengo miedo es: "+draco.getBoggart();
        System.out.println(msg);

    }
}