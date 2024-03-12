package desafio.estagio.api.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCadastroCliente(
        @NotBlank String nome,
        @NotBlank @Email String email,
        @NotNull Integer idade) {
}
