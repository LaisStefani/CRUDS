/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TESTES;

import DAO.DiretorDAO;
import MODEL.Tbl_Diretor;


/**
 *
 * @author lalam
 */
public class Diretor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Tbl_Diretor diretor1 = new Tbl_Diretor();
        
        diretor1.setNome_diretor("Mark Webb");
        diretor1.setNacionalidade("Estados Unidos");
        diretor1.setDt_nascimento("31 de agosto de 1974");
        

        
        DiretorDAO dao1 = new DiretorDAO();
        dao1.inserir(diretor1);

        Tbl_Diretor diretor2 = new Tbl_Diretor();
        diretor2.setNome_diretor("Donald Petrie");
        diretor2.setNacionalidade("Estados Unidos");
        diretor2.setDt_nascimento(" 2 de abril de 1954 ");

        DiretorDAO dao2 = new DiretorDAO();
        dao2.inserir(diretor2);
    }

}
