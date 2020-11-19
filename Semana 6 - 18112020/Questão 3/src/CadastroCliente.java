public class CadastroCliente {
    Cliente[] cadastro = new Cliente[10];
    int clientes = 0;

    public void inserir(Cliente cliente) {
        if (this.clientes == 10) {
            throw new RepositorioExeptions("Numero maximo de clientes atigindo");
        } else {
            if (buscar(cliente.getCPF())) {
                throw new ClienteJaExistenteException("O cliente ja existe no cadastro");
            } else {
                this.cadastro[clientes] = cliente;
                this.clientes = this.clientes + +1;
            }
        }
    }

    public boolean buscar(String cpf) {
        for (Cliente aux : this.cadastro) {
            if (cpf == aux.getCPF()) {
                return true;
            }
        }
        throw new ClienteInexistenteException("Cliente não cadastrado");
    }
}