public class Ninja {
    private String nombre, aldea, clan,rango;
    public Ninja(String nombre,String aldea, String clan, String rango){
        this.nombre=nombre;
        this.aldea=aldea;
        this.clan=clan;
        this.rango=rango;
    }
    public String getNombre(){  return nombre;  }
    public String getAldea(){  return aldea;  }
    public String getClan(){  return clan;  }
    public String getRango(){  return rango;  }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else return false;
    }
    public boolean setAldea(String aldea){
        if (!aldea.isEmpty()){
            this.aldea=aldea;
            return true;
        }else return false;
    }
    public boolean setClan(String clan){
        if (!clan.isEmpty()){
            this.clan=clan;
            return true;
        }else return false;
    }
    public boolean setRango(String rango){
        if (!rango.isEmpty()){
            this.rango=rango;
            return true;
        }else return false;
    }
}