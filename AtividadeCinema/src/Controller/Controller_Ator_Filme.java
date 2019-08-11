/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author lalam
 */
public class Controller_Ator_Filme {

    public void salvar(int id_ator, int id_filme)
        throws SQLException, ParseException {
        new DAO.Ator_FilmeDAO().inserir(id_ator, id_filme);
    }
}
