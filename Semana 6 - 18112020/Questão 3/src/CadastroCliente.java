public class CadastroCliente {
    
    Cliente[] cadastro = new Cliente[10];
    int clientes = 0;

    public void inserir(Cliente cliente) {
        
        if (this.clientes == 10) {
            
            throw new RepositorioExeptions("Já atingimos o número máximo de clientes!");
            
        } else {
            
            if (buscar(cliente.getCPF())) {
                
                throw new ClienteJaExistenteException("Cliente com cadastro já existente!");
                
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
        
        throw new ClienteInexistenteException("O Cliente não foi cadastrado!");
        
    }
    
}
