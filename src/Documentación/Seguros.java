
package Documentación;




/**
 * @author Rafa y Edu
 */
public class Seguros {
    private String dni;
    private String nPoliza;
    private String nomCompania;
    private String matricula;
    private boolean encontrado= false;
    

    public Seguros(String dni, String nPoliza, String nomCompania, String matricula) {
        this.nPoliza = nPoliza;
        this.dni = dni;
        this.nomCompania = nomCompania;
        this.matricula = matricula;
    }

    public Seguros(){
        
    }

    public String getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(String nPoliza) {
        this.nPoliza = nPoliza;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    @Override
    public String toString() {
        return  dni +" "+ nPoliza +" "+ nomCompania +" "+ matricula +" "+ encontrado;
    }

    


    
}
