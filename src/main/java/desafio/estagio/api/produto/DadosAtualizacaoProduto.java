package desafio.estagio.api.produto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosAtualizacaoProduto(
        @NotNull
        Long id,
        String nome,
        BigDecimal preco,
        String descricao
        ) {
}
