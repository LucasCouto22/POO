public class ClienteJaExistenteException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ClienteJaExistenteException(String mensagem) {
        
        super(mensagem);
        
    }
}
