/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.ConexionBD;
import model.usuario_datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipoController {

    // Método para insertar un equipo
    public void registrar(usuario_datos Udatos) throws SQLException {
        String sql = "INSERT INTO usuarios_admin (nombre, apellido, modelo, contraseña,usuario) VALUES (?, ?, ?, ?,?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Udatos.getNombre());
            stmt.setString(2, Udatos.getApellido());
            stmt.setString(3, Udatos.getContraseña());
            stmt.setString(4, Udatos.getUsuario());
            stmt.executeUpdate();
        }
    }
}