/**
 * Classe Contacto representa um contato com nome, telefone e email.
 */
public class Contacto {
    private String nome;
    private String telefone;
    private String email;

    /**
     * Construtor que inicializa um contato com nome, telefone e email.
     * @param nome O nome do contato.
     * @param telefone O telefone do contato.
     * @param email O email do contato.
     */
    public Contacto(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Obtém o nome do contato.
     * @return O nome do contato.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do contato.
     * @param nome O novo nome do contato.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o telefone do contato.
     * @return O telefone do contato.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do contato.
     * @param telefone O novo telefone do contato.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o email do contato.
     * @return O email do contato.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do contato.
     * @param email O novo email do contato.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna uma representação em string do contato.
     * @return Uma string representando o contato.
     */
    @Override
    public String toString() {
        return "Contacto{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
