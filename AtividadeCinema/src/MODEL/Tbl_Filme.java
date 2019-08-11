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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author lalam
 */
@Entity
public class Tbl_Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*Faz a função do auto increment*/
    private Integer id_filme;
    private String nome_filmePT;
    private String nome_filmeEN;
    private String ano_lancamento;
    private int duracao;

    @ManyToOne
    private Tbl_Diretor tbl_Diretor;

    @ManyToOne
    private Tbl_Genero tbl_Genero;

    @ManyToMany(mappedBy = "list_filme")
    private List<Tbl_Ator> list_ator;

    public Tbl_Filme(String nome_filmePT, String nome_filmeEN, String ano_lancamento, int duração, Tbl_Genero g1, Tbl_Diretor d1) {

        this.nome_filmePT = nome_filmePT;
        this.nome_filmeEN = nome_filmeEN;
        this.ano_lancamento = ano_lancamento;
        this.duracao = duração;
        this.tbl_Diretor = d1;
        this.tbl_Genero = g1;

    }

    public Tbl_Filme() {
    }
    
        
    public List<Tbl_Ator> getList_ator() {
        return list_ator;
    }    
    
    public void setList_ator(List<Tbl_Ator> list_ator) {
        this.list_ator = list_ator;
    }
    
    public Tbl_Genero getTbl_Genero() {
        return tbl_Genero;
    }

    public void setTbl_Genero(Tbl_Genero tbl_Genero) {
        this.tbl_Genero = tbl_Genero;
    }

    public Tbl_Diretor getTbl_Diretor() {
        return tbl_Diretor;
    }

    public void setTbl_Diretor(Tbl_Diretor tbl_Diretor) {
        this.tbl_Diretor = tbl_Diretor;
    }

    public Integer getId_filme() {
        return id_filme;
    }

    public void setId_filme(Integer id_filme) {
        this.id_filme = id_filme;
    }

    public String getNome_filmePT() {
        return nome_filmePT;
    }

    public void setNome_filmePT(String nome_filmePT) {
        this.nome_filmePT = nome_filmePT;
    }

    public String getNome_filmeEN() {
        return nome_filmeEN;
    }

    public void setNome_filmeEN(String nome_filmeEN) {
        this.nome_filmeEN = nome_filmeEN;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

}
