package desafio.estagio.api.cliente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String email,
        Integer idade) {
}
