package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProdutoTest {

    @Test
    void deveCriarProduto() {
        IServico servico = ServicoFactory.obterServico("Produto");
        assertEquals("Produto criado", servico.criar());
    }

    @Test
    void deveDeletarProduto() {
        IServico servico = ServicoFactory.obterServico("Produto");
        assertEquals("Produto deletado", servico.deletar());
    }
}