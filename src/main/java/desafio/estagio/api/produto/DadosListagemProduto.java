package desafio.estagio.api.produto;


import java.math.BigDecimal;

public record DadosListagemProduto(Long id, String nome, BigDecimal preco, String descricao) {

    public DadosListagemProduto(Produto produto) {
        this(produto.getId(), produto.getNome(), produto.getpreco(), produto.getDescricao());
    }
}
