package desafio.estagio.api.produto;

import desafio.estagio.api.cliente.DadosAtualizacaoCliente;
import desafio.estagio.api.cliente.DadosCadastroCliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal preco;
    private String descricao;


    public Produto(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
    }

    public void atualizarInformacoes(DadosAtualizacaoProduto dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.preco() != null) {
            this.preco = dados.preco();
        }
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getpreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
