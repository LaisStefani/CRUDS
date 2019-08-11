/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TESTES;

import DAO.GeneroDAO;
import MODEL.Tbl_Genero;

/**
 *
 * @author lalam
 */
public class Genero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tbl_Genero genero1 = new Tbl_Genero();
        genero1.setGenero("Comédia");

        GeneroDAO dao1 = new GeneroDAO();
        dao1.inserir(genero1);

        Tbl_Genero genero2 = new Tbl_Genero();
        genero2.setGenero("Ação");

        GeneroDAO dao2 = new GeneroDAO();
        dao2.inserir(genero2);
    }

}
