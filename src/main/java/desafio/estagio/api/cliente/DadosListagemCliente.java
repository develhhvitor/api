package desafio.estagio.api.cliente;

public record DadosListagemCliente(Long id, String nome, Integer idade) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getIdade());
    }
}
