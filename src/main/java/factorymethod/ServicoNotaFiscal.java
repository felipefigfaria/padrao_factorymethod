package factorymethod;

public class ServicoNotaFiscal implements IServico {

    public String criar() {
        return "Nota Fiscal criada";
    }

    public String deletar() {
        return "Nota Fiscal deletada";
    }
}
