package br.com.silrait.modelo;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String email;

    public Pessoa(Integer id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa[id: "+ this.id +", nome: "+ this.nome + ", email: "+ this.email +"]";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
}