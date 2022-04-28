import org.xml.sax.SAXNotRecognizedException;

public class Spiderman {
    private int id;
    private String planeta,nombreSpider, nombreReal,tipoTraje, descripcion;
    public Spiderman(int id, String planeta,String nombreSpider, String nombreReal, String tipoTraje, String descripcion){
        this.id=id;
        this.planeta=planeta;
        this.nombreReal=nombreReal;
        this.nombreSpider=nombreSpider;
        this.tipoTraje=tipoTraje;
        this.descripcion=descripcion;

    }

    public int getId(){  return id;  }
    public String getPlaneta(){  return planeta;  }
    public String getNombreReal(){  return nombreReal;  }
    public String getTipoTraje(){  return tipoTraje;  }
    public String getDescripcion(){  return descripcion;  }
    public String getNombreSpider(){  return nombreSpider;  }
    public boolean setId(int id){
        if(id>0){
            this.id=id;
            return true;
        }else return false;
    }
    public boolean setPlaneta(String planeta){
        if(!planeta.isEmpty()){
            this.planeta=planeta;
            return true;
        }else return false;
    }
    public boolean setNombreSpider(String nombreSpider){
        if (!nombreSpider.isEmpty()){
            this.nombreSpider=nombreSpider;
            return true;
        }else return false;
    }
    public boolean setNombreReal(String nombreReal){
        if(!nombreReal.isEmpty()){
            this.nombreReal=nombreReal;
            return true;
        }else return false;
    }
    public boolean setTipoTraje(String tipoTraje){
        if (!tipoTraje.isEmpty()){
            this.tipoTraje=tipoTraje;
            return true;
        }else return false;
    }
    public boolean setDescripcion(String descripcion){
        if (!descripcion.isEmpty()){
            this.descripcion=descripcion;
            return true;
        }else return false;
    }
    public String showMessage(){
        return "id: "+id+" Nombre nombre: "+nombreSpider+ "\n"
                +"Nombre real: "+nombreReal+" Traje: "+tipoTraje+"\n"
                +"Descripcion: "+descripcion+"\n";
    }
}
