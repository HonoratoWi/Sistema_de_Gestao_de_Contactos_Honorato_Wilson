import java.util.ArrayList;
import java.util.List;
    ////Classe GerenciadorDeContatos gerencia uma lista de contatos.
public class GerenciadorDeContatos {
    private List<Contacto> contactos;

        /**
         * Construtor que inicializa a lista de contatos.
         */
    public GerenciadorDeContatos() {
        this.contactos = new ArrayList<>();
    }

        /**
         * Adiciona um novo contato à lista de contatos.
         * @param contacto O contato a ser adicionado.
         */
    public void adicionarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

        /**
         * Lista todos os contatos presentes na lista.
         */
    public void listarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

        /**
         * Busca um contato pelo nome.
         * @param nome O nome do contato a ser buscado.
         * @return O contato encontrado ou null se não for encontrado.
         */
    public Contacto buscarContacto(String nome) {
        for (Contacto contacto : contactos) {
            if (contacto.getNome().equalsIgnoreCase(nome)) {
                return contacto;
            }
        }
        return null;
    }

        /**
         * Remove um contato pelo nome.
         * @param nome O nome do contato a ser removido.
         * @return true se o contato foi removido, false caso contrário.
         */
    public boolean removerContacto(String nome) {
        Contacto contacto = buscarContacto(nome);
        if (contacto != null) {
            contactos.remove(contacto);
            return true;
        }
        return false;
    }
}
