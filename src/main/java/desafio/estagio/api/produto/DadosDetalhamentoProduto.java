package desafio.estagio.api.produto;

import desafio.estagio.api.cliente.DadosDetalhamentoCliente;

import java.math.BigDecimal;

public record DadosDetalhamentoProduto(Long id, String nome, BigDecimal preco, String descricao) {
    public DadosDetalhamentoProduto(Produto produto) {
        this(produto.getId(), produto.getNome(), produto.getpreco(), produto.getDescricao());
    }
}
