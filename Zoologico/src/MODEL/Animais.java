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
 * @author NIDE08
 */
@Entity
public class Animais {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
           
    private int id_animais;
    private String classe, cientifico, popular;
    private float peso;
    private int idade;

    @ManyToOne
    @JoinColumn (name="habitat" , nullable = false)
    
    private Habitat fk_habitat;

   public Animais(String classe, String cientfico, String popular, float peso, int idade, Habitat tipo) {
        this.classe = classe;
        this.cientifico = cientifico;
        this.popular = popular;
        this.peso = peso;
        this.idade = idade;
        this.fk_habitat = tipo;
        
   }
    public void setId_animais(int id_animais) {
        this.id_animais = id_animais;
    }

     public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
   
    public String getCientifico() {
        return cientifico;
    }

    public void setCientifico(String cientifico) {
        this.cientifico = cientifico;
    }

    public String getPopular() {
        return popular;
    }

    public void setPopular(String popular) {
        this.popular = popular;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Habitat getFk_habitat() {
        return fk_habitat;
    }

    public void setFk_habitat(Habitat fk_habitat) {
        this.fk_habitat = fk_habitat;
    }

    

}
