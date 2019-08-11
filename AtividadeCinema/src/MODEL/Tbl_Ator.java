/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author lalam
*/

@Entity
public class Tbl_Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*Faz a função do auto increment*/
    private Integer id_ator;
    private String nome_ator;
    private Character sexo;
    private String dt_nascimento;

    @ManyToMany
    @JoinTable(name = "Filme_Ator", joinColumns = @JoinColumn(name = "ID_Ator"),
    inverseJoinColumns = @JoinColumn(name = "ID_Filme"))
    
    private List<Tbl_Filme> list_filme;

    public Tbl_Ator() {
     }

    public List<Tbl_Filme> getList_filme() {
        return list_filme;
    }

    public void setList_filme(List<Tbl_Filme> list_filme) {
        this.list_filme = list_filme;
    }

    public Tbl_Ator(Integer id_ator, String nome_ator, Character sexo, String dt_nascimento, List<Tbl_Filme> list_filme) {
        this.id_ator = id_ator;
        this.nome_ator = nome_ator;
        this.sexo = sexo;
        this.dt_nascimento = dt_nascimento;
        this.list_filme = list_filme;
    }

    
    
    
    public Integer getId_ator() {
        return id_ator;
    }

    public void setId_ator(Integer id_ator) {
        this.id_ator = id_ator;
    }

    public String getNome_ator() {
        return nome_ator;
    }

    public void setNome_ator(String nome_ator) {
        this.nome_ator = nome_ator;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

}
