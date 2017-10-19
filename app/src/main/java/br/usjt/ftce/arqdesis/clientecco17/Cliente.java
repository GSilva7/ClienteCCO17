package br.usjt.ftce.arqdesis.clientecco17;

import java.io.Serializable;

/**
 * Created by arqdsis on 19/10/2017.
 */

public class Cliente  implements Serializable
{
    private String nome, fone, email;
    private int id;

    public Cliente(int id, String nome, String fone, String email)
    {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
