package factorymethod;

public class ServicoProduto implements IServico {

    public String criar() {
        return "Produto criado";
    }

    public String deletar() {
        return "Produto deletado";
    }
}
