package HarryConstructor;

public class Personaje {
    private String nombre, genero, casa, varita, boggart, pureza, patronus;
    // Sobrecargar el constructor = overload
    public Personaje(String nombre, String genero, String casa, String varita, String pureza){
        this.nombre=nombre;
        this.genero=genero;
        this.casa=casa;
        this.varita= varita;
        this.pureza=pureza;
    }

    public Personaje(String nombre, String genero, String casa, String varita, String pureza, String boggart){
        this.nombre=nombre;
        this.genero=genero;
        this.casa=casa;
        this.varita= varita;
        this.pureza=pureza;
        this.boggart=boggart;
    }
    public Personaje(String nombre, String genero, String casa, String varita, String pureza, String boggart, String patronus){
        this.nombre=nombre;
        this.genero=genero;
        this.casa=casa;
        this.varita= varita;
        this.pureza=pureza;
        this.boggart=boggart;
        this.patronus=patronus;
    }

    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){  return casa;  }
    public String getPureza(){  return pureza;  }
    public String getVarita(){  return varita;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

}
