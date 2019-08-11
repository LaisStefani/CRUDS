/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TESTES;

import DAO.AtorDAO;
import MODEL.Tbl_Ator;
import MODEL.Tbl_Diretor;
import MODEL.Tbl_Filme;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lalam
 */
public class AtorT {

    /**
     * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        Tbl_Ator ator = new Tbl_Ator();
        ator.setNome_ator("Andrew Garfield");
        //ator.setSexo("M");
        ator.setDt_nascimento("20/08/1983");

        AtorDAO dao = new AtorDAO();
        dao.inserir(ator);

        Tbl_Ator ator1 = new Tbl_Ator();
        ator1.setNome_ator("Sandra Bullock");
        //ator1.setSexo("F");
        ator1.setDt_nascimento("26/06/1964");

        AtorDAO dao1 = new AtorDAO();
        dao1.inserir(ator1);
    }
}
