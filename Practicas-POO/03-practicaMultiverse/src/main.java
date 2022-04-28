public class main {
    public static void main(String[] args) {
        Screen screen= new Screen();
        muestraInfo s1= new muestraInfo(1,"Tierra-616","Spider-man","Peter Parker",
                "Traje hecho de tela color rojo y azul",
                "Es el spiderman mas famoso, todos lo conocemos por las peliculas de marvel");

        s1.MostrarDatos(screen);
        s1.spider616Image(screen);
        s1.lanzarTelarana(screen);
        s1.columpiarse(screen);

        Screen screen2=new Screen();
        muestraInfo s2= new muestraInfo(2,"Tierra-1610","Spider-man","Miles Morales",
                "Traje hecho de tela negra con rojo",
                "Es el spiderman que salio en la pelicula animada de sony");
        s2.MostrarDatos(screen2);
        s2.spiderMilesImage(screen2);
        s2.treparMuros(screen2);
        s2.columpiarse(screen2);

        Screen screen3=new Screen();
        muestraInfo s3= new muestraInfo(3,"Tierra-807128","Spider-Girl","Ashley Barton",
                "Traje hecho de tela rojo con azul sin mangas",
                "Es una version femenina de spiderman");
        s3.MostrarDatos(screen3);
        s3.spiderGirlImage(screen3);
        s3.punzada(screen3);
        s3.lanzarTelarana(screen3);
    }
}
