/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author lalam
 */
@Entity
public class Tbl_Diretor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*Faz a função do auto increment*/
    private Integer id_diretor;
    private String nome_diretor;
    private String nacionalidade;
    private String dt_nascimento;
    
    public Integer getId_diretor() {
        return id_diretor;
    }

    public void setId_diretor(Integer id_diretor) {
        this.id_diretor = id_diretor;
    }

    public String getNome_diretor() {
        return nome_diretor;
    }

    public void setNome_diretor(String nome_diretor) {
        this.nome_diretor = nome_diretor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

}
