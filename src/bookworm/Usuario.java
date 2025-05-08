/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookworm;

public class Usuario {
    String nombre, cedula, favorito;
    
    public Usuario(String nombre, String cedula, String favorito) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.favorito = favorito;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFavorito() {
        return favorito;
    }
    
    
    
    
}
