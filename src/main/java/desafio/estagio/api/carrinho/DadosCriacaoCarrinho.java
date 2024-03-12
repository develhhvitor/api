package desafio.estagio.api.carrinho;

import desafio.estagio.api.cliente.Cliente;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosCriacaoCarrinho(
        @NotNull BigDecimal valorTotal,
        @NotNull Cliente clienteId
) {
    public static void criar(Long clienteId) {

    }
}
