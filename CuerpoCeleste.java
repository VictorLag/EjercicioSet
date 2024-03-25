import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {

    public enum TipoCuerpoCeleste {Estrella,Planeta,Planeta_Enano,Luna,Cometa,Asteroide};
    private String nombre;
    private double periodoOrbital;
    private HashSet<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste (String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo){

        this.nombre=nombre;
        this.periodoOrbital=periodoOrbital;
        this.tipoCuerpo=tipoCuerpo;
        satelites=new HashSet<>();

    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public HashSet<CuerpoCeleste> getSatelites(){

        HashSet<CuerpoCeleste> hasset= new HashSet<>();

        hasset=this.satelites;

        return hasset;
    }


    public boolean addSatelite (CuerpoCeleste cuerpoCeleste){

        return satelites.add(cuerpoCeleste);
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", periodoOrbital=" + periodoOrbital +
                ", tipoCuerpo=" + tipoCuerpo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CuerpoCeleste that = (CuerpoCeleste) o;

        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        return tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (tipoCuerpo != null ? tipoCuerpo.hashCode() : 0);
        return result;
    }
}
