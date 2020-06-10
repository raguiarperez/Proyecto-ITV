/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentación;

/**
 *
 * @author rafag
 */
public class Usuarios {
    private String nombreUsuario;
    private String correo;
    private String contraseña;

    public Usuarios(String nombreUsuario, String correo, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuarios() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombreUsuario=" + nombreUsuario + ", correo=" + correo + ", contraseña=" + contraseña + '}';
    }
    

}
