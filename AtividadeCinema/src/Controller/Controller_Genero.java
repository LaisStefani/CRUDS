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
public class Controller_Genero {
    public void salvar(String genero)
        throws SQLException, ParseException {
        MODEL.Tbl_Genero genero1 = new MODEL.Tbl_Genero();
        genero1.setGenero(genero);
        new DAO.GeneroDAO().inserir(genero1);
    }
}
