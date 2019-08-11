/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lalam
 */
@Entity
@Table(name = "pessoas", catalog = "bdjava", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pessoas.findAll", query = "SELECT p FROM Pessoas p")
    , @NamedQuery(name = "Pessoas.findByCodPessoas", query = "SELECT p FROM Pessoas p WHERE p.codPessoas = :codPessoas")
    , @NamedQuery(name = "Pessoas.findByCodUsuarios", query = "SELECT p FROM Pessoas p WHERE p.codUsuarios = :codUsuarios")
    , @NamedQuery(name = "Pessoas.findByPessoa", query = "SELECT p FROM Pessoas p WHERE p.pessoa = :pessoa")
    , @NamedQuery(name = "Pessoas.findByNasc", query = "SELECT p FROM Pessoas p WHERE p.nasc = :nasc")
    , @NamedQuery(name = "Pessoas.findByRg", query = "SELECT p FROM Pessoas p WHERE p.rg = :rg")
    , @NamedQuery(name = "Pessoas.findByCpf", query = "SELECT p FROM Pessoas p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Pessoas.findByEmail", query = "SELECT p FROM Pessoas p WHERE p.email = :email")
    , @NamedQuery(name = "Pessoas.findByTelefone", query = "SELECT p FROM Pessoas p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Pessoas.findByCelular", query = "SELECT p FROM Pessoas p WHERE p.celular = :celular")})
public class Pessoas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codPessoas")
    private Integer codPessoas;
    @Column(name = "codUsuarios")
    private Integer codUsuarios;
    @Column(name = "pessoa")
    private String pessoa;
    @Column(name = "nasc")
    private String nasc;
    @Column(name = "RG")
    private String rg;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "email")
    private String email;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "celular")
    private String celular;

    public Pessoas() {
    }

    public Pessoas(Integer codPessoas) {
        this.codPessoas = codPessoas;
    }

    public Integer getCodPessoas() {
        return codPessoas;
    }

    public void setCodPessoas(Integer codPessoas) {
        Integer oldCodPessoas = this.codPessoas;
        this.codPessoas = codPessoas;
        changeSupport.firePropertyChange("codPessoas", oldCodPessoas, codPessoas);
    }

    public Integer getCodUsuarios() {
        return codUsuarios;
    }

    public void setCodUsuarios(Integer codUsuarios) {
        Integer oldCodUsuarios = this.codUsuarios;
        this.codUsuarios = codUsuarios;
        changeSupport.firePropertyChange("codUsuarios", oldCodUsuarios, codUsuarios);
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        String oldPessoa = this.pessoa;
        this.pessoa = pessoa;
        changeSupport.firePropertyChange("pessoa", oldPessoa, pessoa);
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        String oldNasc = this.nasc;
        this.nasc = nasc;
        changeSupport.firePropertyChange("nasc", oldNasc, nasc);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        String oldCelular = this.celular;
        this.celular = celular;
        changeSupport.firePropertyChange("celular", oldCelular, celular);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPessoas != null ? codPessoas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoas)) {
            return false;
        }
        Pessoas other = (Pessoas) object;
        if ((this.codPessoas == null && other.codPessoas != null) || (this.codPessoas != null && !this.codPessoas.equals(other.codPessoas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.Pessoas[ codPessoas=" + codPessoas + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
