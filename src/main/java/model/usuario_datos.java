/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Desktop
 */
public class usuario_datos {
    private int id;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String usuario;

    // Constructor
    public usuario_datos(int id, String nombre, String apellido, String contraseña, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

