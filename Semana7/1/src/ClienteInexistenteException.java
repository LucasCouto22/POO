public class ClienteInexistenteException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ClienteInexistenteException(String mensagem) {
        super(mensagem);
    }
}
