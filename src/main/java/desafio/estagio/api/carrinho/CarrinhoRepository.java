package desafio.estagio.api.carrinho;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    List<Carrinho> findCarrinhoByClienteId(Long id);
}
