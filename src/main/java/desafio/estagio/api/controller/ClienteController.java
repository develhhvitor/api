package desafio.estagio.api.controller;

import desafio.estagio.api.cliente.*;
import desafio.estagio.api.produto.DadosCadastroProduto;
import desafio.estagio.api.produto.DadosDetalhamentoProduto;
import desafio.estagio.api.produto.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroCliente dados, UriComponentsBuilder uriBuilder) {
        var cliente = new Cliente(dados);
        repository.save(cliente);

        var uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoCliente(cliente));
    }

    @GetMapping
    public ResponseEntity<List<DadosListagemCliente>> listar() {
        var list = repository.findAllByAtivoTrue().stream().map(DadosListagemCliente::new).toList();
        return ResponseEntity.ok(list);
    }

    @PutMapping
    @Transactional
        public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoCliente dados) {
        var cliente = repository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosDetalhamentoCliente(cliente));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        var cliente = repository.getReferenceById(id);
        cliente.excluir();

        return ResponseEntity.noContent().build();
    }
}
