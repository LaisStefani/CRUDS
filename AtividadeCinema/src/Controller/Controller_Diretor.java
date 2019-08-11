/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import MODEL.Tbl_Diretor;
import DAO.DiretorDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author lalam
 */
public class Controller_Diretor {

    public void salvar(Integer id, String nome_diretor, String nacionalidade, String dt_nascimento) throws SQLException, ParseException {

        if (id == null) {
            MODEL.Tbl_Diretor diretor1 = new MODEL.Tbl_Diretor();
            
            diretor1.setNome_diretor(nome_diretor);
            diretor1.setDt_nascimento(dt_nascimento);
            diretor1.setNacionalidade(nacionalidade);
            
            new DAO.DiretorDAO().inserir(diretor1);
        }else{
            new DAO.DiretorDAO().atualizar(id, nome_diretor, nacionalidade, dt_nascimento);
        }

    }

    public List<Tbl_Diretor> enviaDados() {
        DAO.DiretorDAO Tbl_Diretor = new DAO.DiretorDAO();
        return Tbl_Diretor.buscaDados();
    }

    public void excluir(int id) {
        new DiretorDAO().deletar(id);
    }

}
