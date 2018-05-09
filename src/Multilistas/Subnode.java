
package Multilistas;

public class Subnode {
    Subnode Link;
    String Modelo, VelMax, Acel;
    int Precio;

    public Subnode(Subnode Link, String Modelo, String VelMax, String Acel, int Precio) {
        this.Link = Link;
        this.Modelo = Modelo;
        this.VelMax = VelMax;
        this.Acel = Acel;
        this.Precio = Precio;
    }

    public Subnode getLink() {
        return Link;
    }

    public void setLink(Subnode Link) {
        this.Link = Link;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getVelMax() {
        return VelMax;
    }

    public void setVelMax(String TopSpeed) {
        this.VelMax = TopSpeed;
    }

    public String getAcel() {
        return Acel;
    }

    public void setAcel(String Acel) {
        this.Acel = Acel;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }  
}
