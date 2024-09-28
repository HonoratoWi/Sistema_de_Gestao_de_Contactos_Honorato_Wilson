import java.util.Scanner;

/**
 * Classe principal que gerencia a interação com o usuário para o sistema de gestão de contatos.
 */
public class Main {
    public static void main(String[] args) {
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Gestão de Contactos");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Remover Contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Adicionar um novo contato
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    gerenciador.adicionarContacto(new Contacto(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    // Listar todos os contatos
                    System.out.println("Lista de Contatos:");
                    gerenciador.listarContactos();
                    break;
                case 3:
                    // Buscar um contato pelo nome
                    System.out.print("Nome do contato a buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Contacto contacto = gerenciador.buscarContacto(nomeBusca);
                    if (contacto != null) {
                        System.out.println(contacto);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    // Remover um contato pelo nome
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = gerenciador.removerContacto(nomeRemover);
                    if (removido) {
                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    // Sair do sistema
                    System.out.println("Saindo...");
                    break;
                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
