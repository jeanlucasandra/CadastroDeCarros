import java.util.ArrayList;
import java.util.List;

public class CadastroDeCarros {
    private List<Carros> carro;

    public CadastroDeCarros() {
        this.carro = new ArrayList<>();
    }

    public void cadastrarCarro(String marca, String cor, String modelo, double valor) {
        Carros carros = new Carros(marca, cor, modelo, valor);
        carro.add(carros);
        System.out.println("Carro cadastrado com sucesso!");
    }//metodo cadastrar carro

    public void ListarCarros() {
        if (carro.isEmpty()) {
            System.out.println("Nenhum carro encontrado!");
            return;
        }

        for (int i = 0; i < carro.size(); i++) {
            System.out.println((i + 1) + ". " + carro.get(i).toString());

        }
    }//metodo listar carro

    public void excluirCarro(int id) {
        if (id < 0 || id >= carro.size()) {
            System.out.println("Nenhum carro encontrado!");
            return;
        }

        carro.remove(id);
        System.out.println("Carro excluido com sucesso!");
    }//metodo remover carro


    public void editarCarro(int id, String marca, String cor, String modelo, double valor) {
        if (id < 0 || id >= carro.size()) {
            System.out.println("Nenhum carro encontrado!");
            return;
        }

        Carros carroEditado = new Carros(marca, modelo, cor, valor);
        carro.set(id, carroEditado);
        System.out.println("Carro editado com sucesso!");
    }//metodo editar carro

    public boolean estaVazia(){
        return carro.isEmpty();
    }

    public int quantidade(){
        return carro.size();
    }

}
