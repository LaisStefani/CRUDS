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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author EDUARDO
 */
@Entity
public class Tratamento {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)   

    private int id_tratamento;
    private String procedimento, descricao;



    @ManyToOne
     // tenho que inserir diretor e genero antes de filme
    @JoinColumn (name="id_vet" , nullable = false)
      private Veterinario fk_vet;
      
    @ManyToOne
     // tenho que inserir diretor e genero antes de filme
    @JoinColumn (name="id_animal" , nullable = false)
     private Animais fk_animal;
      
    public Tratamento (String procedimento, String descricao, Veterinario fk_vet, Animais fk_animal){
        this.procedimento = procedimento;
        this.descricao= descricao;
        this.fk_vet = fk_vet;
        this.fk_animal = fk_animal;
    }    
    public Tratamento(){
    
    }
    

    public int getId_tratamento() {
        return id_tratamento;
    }

    public void setId_tratamento(int id_tratamento) {
        this.id_tratamento = id_tratamento;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Veterinario getFk_vet() {
        return fk_vet;
    }

    public void setFk_vet(Veterinario fk_vet) {
        this.fk_vet = fk_vet;
    }

    public Animais getFk_animal() {
        return fk_animal;
    }

    public void setFk_animal(Animais fk_animal) {
        this.fk_animal = fk_animal;
    }

}
