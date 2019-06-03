package Documentación;

/**
 * @author Mirroriced y Rafsniper
 */
public class Seguros {

    private String dni;
    private String nPoliza;
    private String nomCompania;
    private String matricula;

    public Seguros(String dni, String nPoliza, String nomCompania, String matricula) {
        this.dni = dni;
        this.nPoliza = nPoliza;
        this.nomCompania = nomCompania;
        this.matricula = matricula;
    }

    public Seguros() {

    }

    public String getDni() {
        return dni;
    }

    public String getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(String nPoliza) {
        this.nPoliza = nPoliza;
    }

    public String getNomCompania() {
        return nomCompania;
    }

    public void setNomCompania(String nomCompañia) {
        this.nomCompania = nomCompañia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return nPoliza + " " + nomCompania + " " + matricula;
    }

}
