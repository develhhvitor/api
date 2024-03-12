package desafio.estagio.api.cliente;

import desafio.estagio.api.cliente.Cliente;

public record DadosDetalhamentoCliente(Long id, String nome, String email, Integer idade) {
    public DadosDetalhamentoCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getIdade());
    }
}
