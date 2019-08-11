/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Factory.ConnectionFactory;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author lalam
 */
public class PessoaDAO {
    private Connection connection;

    
    public PessoaDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionar(Pessoa pessoa){
        String sql = "INSERT INTO pessoas(pessoa,nasc,RG,CPF,email,telefone,celular)VALUES(?,?,?,?,?,?,?)";
        //try catch para conexões sql
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,pessoa.getNome());
            stmt.setString(2,pessoa.getNasc());
            stmt.setString(3,pessoa.getRG());
            stmt.setString(4,pessoa.getCPF());
            stmt.setString(5,pessoa.getEmail());
            stmt.setInt(6,pessoa.getTel());
            stmt.setInt(7,pessoa.getCelular());
            
            stmt.execute();
            stmt.close();
            
        } catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
        
    public void deletar(String pessoa){
        String sql = "DELETE FROM pessoas WHERE cpf = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,pessoa);
            stmt.execute();
            stmt.close();
            
        } catch(SQLException u){
            throw new RuntimeException(u);
        }        
    }
    
    
    public void editar (Pessoa pessoa){
        String sql = "UPDATE pessoas SET pessoa = ?, RG = ?, CPF = ?, email = ? , telefone = ? , celular = ?" + " WHERE pessoa = ? ";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,pessoa.getNome());
            stmt.setString(2,pessoa.getRG());
            stmt.setString(3,pessoa.getCPF());
            stmt.setString(4,pessoa.getEmail());
            stmt.setInt(5,pessoa.getTel());
            stmt.setInt(6,pessoa.getCelular());
            stmt.setString(7,pessoa.getNome());
            stmt.execute();
            stmt.close();
            
        } catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
}
