package Models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String senha;


    public Usuario(int id, String nome, String senha, String email) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public Usuario(){

    }

}
