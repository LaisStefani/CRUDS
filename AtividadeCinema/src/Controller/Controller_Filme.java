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
public class Controller_Filme {

    public void salvar(String nome_filmePT, String nome_filmeEN, String ano_lancamento, int duração, int diretor, int genero) 
            throws SQLException, ParseException {
        
        new DAO.FilmeDAO().inserir(nome_filmePT, nome_filmeEN,ano_lancamento,duração,genero,diretor);

    }
}
