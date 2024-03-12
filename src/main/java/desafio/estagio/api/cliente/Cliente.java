package desafio.estagio.api.cliente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "clientes")
@Entity(name = "cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private Integer idade;

    private Boolean ativo;


    public Cliente(DadosCadastroCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.idade = dados.idade();
    }

    public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.email() != null) {
            this.email = dados.email();
        }
        if (dados.idade() != null) {
            this.idade = dados.idade();
        }
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }


    public void excluir() {
        this.ativo = false;
    }
}
