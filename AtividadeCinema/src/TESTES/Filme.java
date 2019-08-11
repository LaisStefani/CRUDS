/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package TESTES;

import DAO.AtorDAO;
import DAO.FilmeDAO;
import MODEL.Tbl_Ator;

import MODEL.Tbl_Diretor;
import MODEL.Tbl_Filme;
import MODEL.Tbl_Genero;
import java.util.List;

 *
 * @author lalam

public class Filme {


     * @param args the command line arguments

    public static void main(String[] args) {
        Tbl_Filme filme1 = new Tbl_Filme();

        Tbl_Genero genero1 = new Tbl_Genero();
        genero1.setId_genero(1);

        Tbl_Diretor diretor1 = new Tbl_Diretor();
        diretor1.setId_diretor(1);

        filme1.setNome_filmePT("O Espetacular Homem-Aranha");
        filme1.setNome_filmeEN("The spectacular Spider Man");
        filme1.setAno_lancamento("6 de julho de 2012");
        filme1.setDuracao(153);
        filme1.setTbl_Genero(genero1);
        filme1.setTbl_Diretor(diretor1);

        FilmeDAO dao1 = new FilmeDAO();
        dao1.inserir(filme1);

        Tbl_Filme filme2 = new Tbl_Filme();

        Tbl_Genero genero2 = new Tbl_Genero();
        genero2.setId_genero(2);

        Tbl_Diretor diretor2 = new Tbl_Diretor();
        diretor2.setId_diretor(2);

        filme2.setNome_filmePT("Miss Simpatia");
        filme2.setNome_filmeEN("Miss sympathy");
        filme2.setAno_lancamento("27 de abril de 2001");
        filme2.setDuracao(110);
        filme2.setTbl_Genero(genero2);
        filme2.setTbl_Diretor(diretor2);


        FilmeDAO dao2 = new FilmeDAO();
        dao2.inserir(filme2);

    }

}
 */