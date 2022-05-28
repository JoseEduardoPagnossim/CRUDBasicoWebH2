package com.CRUD.cliente.cadastro.contatos.modelo;


import javax.persistence.*;

@Entity
public class Contato {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String celular;

    @Column(nullable = false)
    private String email;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return getId() == contato.getId();
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome='" + nome + '\'' + ", celular='" + celular + '\'' + ", email='" + email + '\'' + '}';
    }
}
