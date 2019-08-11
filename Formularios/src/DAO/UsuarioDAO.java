/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Pessoa;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lalam
 */
public class UsuarioDAO {
    private final Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adicionar(Usuario usuario){
        String sql = "INSERT INTO usuarios(usuario,senha)VALUES(?,?)";
        try{
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2,usuario.getSenha());
            stmt.execute();
            stmt.close();
            
        } catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
}
