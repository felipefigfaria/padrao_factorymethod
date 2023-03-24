package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoNotaFiscalTest {

    @Test
    void deveCriarNotaFiscal() {
        IServico servico = ServicoFactory.obterServico("NotaFiscal");
        assertEquals("Nota Fiscal criada", servico.criar());
    }

    @Test
    void deveDeletarNotaFiscal() {
        IServico servico = ServicoFactory.obterServico("NotaFiscal");
        assertEquals("Nota Fiscal deletada", servico.deletar());
    }
}