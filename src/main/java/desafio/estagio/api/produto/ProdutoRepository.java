package desafio.estagio.api.produto;

import desafio.estagio.api.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAll();
}
