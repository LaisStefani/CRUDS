/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import MODEL.Tbl_Ator;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author lalam
 */
public class Controller_Ator {

    public void salvar(String nome, Character sexo, String nascimento)
            throws SQLException, ParseException {
        Tbl_Ator ator1 = new Tbl_Ator();
        ator1.setNome_ator(nome);
        ator1.setDt_nascimento(nascimento);
        ator1.setSexo(sexo);
        new DAO.AtorDAO().inserir(ator1);
    }
}
