/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import MODEL.Veterinario;
import DAO.VeterinarioDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author NIDE08
 */
public class VeterinarioController {
    public void salvar (int CRMV, String nome, String especi, String Facu, String regiao)throws
        SQLException, ParseException{ 
        MODEL.Veterinario vet = new MODEL.Veterinario();
        vet.setCRMV(CRMV);
        vet.setNome(nome);
        vet.setEspecializacao(especi);
        vet.setFaculdade(Facu);
        vet.setRegiao(regiao);
           
        new DAO.VeterinarioDAO().inserir(vet);//inserir esta na DAO
                 
            }
    public List<Veterinario> enviaDados(){
          VeterinarioDAO vet = new VeterinarioDAO();
          
          return vet.buscaDados();
          
            }
      
    public void excluir (int id){
         // pega o da DAO
       new  VeterinarioDAO ().deletar(id);
     
                }
}
