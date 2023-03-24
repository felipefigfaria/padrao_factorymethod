package factorymethod;

public class ServicoCliente implements IServico {

    public String criar() {
        return "Cliente criado";
    }

    public String deletar() {
        return "Cliente deletado";
    }
}
