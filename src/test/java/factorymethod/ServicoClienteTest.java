package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoClienteTest {

    @Test
    void deveCriarCliente() {
        IServico servico = ServicoFactory.obterServico("Cliente");
        assertEquals("Cliente criado", servico.criar());
    }

    @Test
    void deveDeletarCliente() {
        IServico servico = ServicoFactory.obterServico("Cliente");
        assertEquals("Cliente deletado", servico.deletar());
    }
}