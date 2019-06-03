package Documentación;

/**
 *
 * @author Mirroriced y Rafsniper
 */
public class DocCoche {

    private String matricula;
    private String numBastidor;
    private String marca;
    private String modelo;
    private String anoMatriculacion;

    public DocCoche(String matricula, String numBastidor, String marca, String modelo, String anoMatriculacion) {
        this.matricula = matricula;
        this.numBastidor = numBastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.anoMatriculacion = anoMatriculacion;
    }

    public DocCoche() {
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoMatriculacion() {
        return anoMatriculacion;
    }

    public void setAnoMatriculacion(String anoMatriculacion) {
        this.anoMatriculacion = anoMatriculacion;
    }

    @Override
    public String toString() {
        return numBastidor + " " + marca + " " + modelo + " " + anoMatriculacion;
    }

}
