import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        CadastroDeCarros cadastro = new CadastroDeCarros();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nCadastro de Carros");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Remover carro");
            System.out.println("3 - Listar carros");
            System.out.println("4 - Editar carros");
            System.out.println("0 - Sair");//menu

            System.out.print("Opção escolhida: ");
            opcao = Integer.parseInt(leia.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite a marca do carro: ");
                    String marca = leia.nextLine();

                    System.out.println("Digite o modelo do carro: ");
                    String modelo = leia.nextLine();

                    System.out.println("Digite a cor do carro: ");
                    String cor = leia.nextLine();

                    System.out.println("Digite o valor do carro: ");
                    double valor = Integer.parseInt(leia.nextLine());

                    cadastro.cadastrarCarro(marca, modelo, cor, valor);
                }//cadastrar carro (opção 1)

                case 2 -> {
                    if (cadastro.estaVazia()) {
                        System.out.println("Nenhum carro cadastrado para excluir!");
                        break;
                    }

                    cadastro.ListarCarros();
                    System.out.println("Posição do carro que deseja remover: ");
                    int id = Integer.parseInt(leia.nextLine()) - 1;

                    if (id < 0 || id >= cadastro.quantidade()) {
                        System.out.println("Posição inválida!");
                        break;
                    }

                    cadastro.excluirCarro(id);
                } //excluir carro (opcao 2)

                case 3 -> cadastro.ListarCarros();//listar carros (opcao 3)

                case 4 -> {
                    if (cadastro.estaVazia()) {
                        System.out.println("Nenhum carro cadastrado para editar!");
                        break;
                    }

                    cadastro.ListarCarros();

                    System.out.println("Posição do carro que deseja editar: ");
                    int id = Integer.parseInt(leia.nextLine()) - 1;

                    if (id < 0 || id >= cadastro.quantidade()) {
                        System.out.println("Posição inválida");
                        break;
                    }

                    System.out.println("Nova marca: ");
                    String marca = leia.nextLine();


                    System.out.println("Novo modelo: ");
                    String modelo = leia.nextLine();

                    System.out.println("Nova cor: ");
                    String cor = leia.nextLine();

                    System.out.println("Novo valor: ");
                    double valor = Double.parseDouble(leia.nextLine());

                    cadastro.editarCarro(id, marca, cor, modelo, valor);
                }//editar carro (opcao 4)


                case 0 -> System.out.println("Saindo do programa....");//sair do programa

                default -> System.out.println("Opção inválida");
            }
        }
    }
}