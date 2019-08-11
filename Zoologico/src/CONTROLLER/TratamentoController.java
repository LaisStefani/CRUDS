/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.sql.SQLException;
import java.text.ParseException;
import DAO.TratamentoDAO;
import MODEL.Tratamento;
import java.util.List;

/**
 *
 * @author NIDE08
 */
public class TratamentoController {
    public void salvar (String procedimento, String descricao, int animal, int veterinario)throws
        SQLException, ParseException{ 
            
        //não precisa de set porque a model Tratamento tem contrutor
        new DAO.TratamentoDAO().inserir(procedimento,descricao, animal, veterinario);//inserir esta na DAO
                 
        }
    public List<Tratamento> enviaDados(){
         TratamentoDAO tratamento = new TratamentoDAO();
         //metodo da DAO
         
         return tratamento.buscaDados();
    }
    public void excluir (int id){
         // pega o da DAO
       new  TratamentoDAO().deletar(id);
     
     }
}
