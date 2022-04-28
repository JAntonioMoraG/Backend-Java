package HarryGetSet;

public class Luna {
    public static void defLuna(){
        Personaje luna=new Personaje();
        luna.setNombre("Luna Lovegood");
        luna.setGenero("Mujer");
        luna.setPureza("Mestizo");
        luna.setCasa("Ravenclaw");
        luna.setPatronus("Liebre");
        luna.setBoggart("No se sabe :c");
        luna.setVarita("cedro, nucleo de fibra de corazon de dragon");
        String msg="___________________________________________________________\n";
        msg+="Hola mi nombre es: "+luna.getNombre()+"\n";
        msg+="Mi genero es: "+luna.getGenero()+"\n";
        msg+="Soy de raza "+luna.getPureza()+"\n";
        msg+="Pertenezco a "+luna.getCasa()+"\n";
        msg+="Mi varita es de "+luna.getVarita()+"\n";
        msg+="Mi patronus es un(a) "+luna.getPatronus()+"\n";
        msg+="A lo que mas le tengo miedo es: "+luna.getBoggart();
        System.out.println(msg);
    }
}
