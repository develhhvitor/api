package desafio.estagio.api.controller;

import desafio.estagio.api.carrinho.Carrinho;
import desafio.estagio.api.carrinho.CarrinhoRepository;
import desafio.estagio.api.carrinho.DadosCriacaoCarrinho;
import desafio.estagio.api.produto.DadosDetalhamentoProduto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoRepository repository;

    @PostMapping("/{clienteId}")
    @Transactional
    public ResponseEntity<String> criar(@PathVariable Long clienteId) {
        DadosCriacaoCarrinho.criar(clienteId);
        return ResponseEntity.ok().build();
    }


}
