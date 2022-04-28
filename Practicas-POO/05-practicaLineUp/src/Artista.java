public class Artista {
    private int id, numeroIntegrantes,numeroCancionesATocar;
    private  String nombreArtista, nombreGrupo;
    public Artista(int id,String nombreArtista,int numeroCancionesATocar){
        this.id=id;
        this.nombreArtista=nombreArtista;
        this.numeroCancionesATocar=numeroCancionesATocar;
    }
    public Artista(int id, String nombreGrupo,int numeroIntegrantes,int numeroCancionesATocar ){
        this.id=id;
        this.nombreGrupo=nombreGrupo;
        this.numeroIntegrantes=numeroIntegrantes;
        this.numeroCancionesATocar=numeroCancionesATocar;
    }
    public int getId(){  return id;  }
    public int getNumeroIntegrantes(){  return numeroIntegrantes;  }
    public int getNumeroCancionesATocar(){  return numeroCancionesATocar;  }
    public String getNombreArtista(){  return nombreArtista;  }
    public String getNombreGrupo(){  return nombreGrupo;  }

    public boolean setId(int id){
        if (id>0){
            this.id=id;
            return true;
        }return false;
    }

    public boolean setNumeroIntegrantes(int numeroIntegrantes){
        if(numeroIntegrantes>0){
            this.numeroIntegrantes=numeroIntegrantes;
            return true;
        }else return false;
    }

    public boolean setNumeroCancionesATocar(int numeroCancionesATocar){
        if(numeroCancionesATocar>0){
            this.numeroCancionesATocar=numeroCancionesATocar;
            return true;
        }else return false;

    }

    public boolean setNombreArtista(String nombreArtista){
        if(!nombreArtista.isEmpty()){
            this.nombreArtista=nombreArtista;
            return true;
        }return false;
    }

    public boolean setNombreGrupo(String nombreGrupo){
        if (!nombreGrupo.isEmpty()){
            this.nombreGrupo=nombreGrupo;
            return true;
        }else return false;
    }
}
