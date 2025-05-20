package Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String descricao;
    private String prioridade;
    private LocalDate dataVencimento;
    private String status;
    private LocalDate dataConclusao;


    public Tarefa(int id, String nome, String prioridade, String descricao, LocalDate dataVencimento, String status, LocalDate dataConclusao) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.dataConclusao = dataConclusao;
    }

    public Tarefa(){
    }

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Usuario responsavel;

}
