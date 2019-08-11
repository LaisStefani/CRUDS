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
 * @author NIDE08
 */
@Entity
public class Habitat {
    
    @Id

    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    private int id_habiat;
    private String habitat;

    public int getId_habiat() {
        return id_habiat;
    }

    public void setId_habiat(int id_habiat) {
        this.id_habiat = id_habiat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
}
