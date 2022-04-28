package HarryGetSet;

import java.security.SecureRandom;
import java.util.Locale;

public class Personaje {
    //Caracteristicas
    public String casa, genero, boggart, patronus, nombre, pureza, varita;

    //Getters
    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){  return casa;  }
    public String getPureza(){  return pureza;  }
    public String getPatronus(){  return patronus;  }
    public String getVarita(){  return varita;  }
    public String getBoggart(){  return boggart;}

    //Setters

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            casa=casa.toLowerCase();
            if(casa.equals("gryffindor") || casa.equals("hufflepuff") || casa.equals("slytherin") || casa.equals("ravenclaw")){
                this.casa=casa;
                return true;
            }else
                return false;
        }else
            return false;
    }

    public boolean setPureza(String pureza){
        if(!pureza.isEmpty()){
            pureza=pureza.toLowerCase();
            if(pureza.equals("mestizo") || pureza.equals("sangre sucia") || pureza.equals("puro")){
                this.pureza=pureza;
                return true;
            }else
                return false;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }else
            return false;
    }
    public boolean setVarita(String varita){
        if(!varita.isEmpty()){
            this.varita=varita;
            return true;
        }else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart=boggart;
            return true;
        }else
            return false;
    }
}
