public class Cliente {
    
    private String CPF;
    private String nome;
    private String endereco;
    private String dataNascimento;

    public Cliente(){};

    public Cliente(Cliente cliente){
        
        this.CPF = cliente.CPF;
        this.nome = cliente.nome;
        this.endereco = cliente.endereco;
        this.dataNascimento = cliente.dataNascimento;
        
    }
    public Cliente(String cpf, String nome, String endereco, String dataNascimento){
        
        this.CPF = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        
    }

    public void setCPF(String CPF) {
        
        if (CPF == null) {
            
            throw new DadoInvalidoException("Por favor preencha o CPF, o campo é obrigatório!");
            
        }
        if (CPF instanceof String) {
            
            this.CPF = CPF;
            
        } else {
            
            throw new DadoInvalidoException("CPF em formato errado, precisa ser uma String!");
            
        }

    }

    public void setNome(String nome) {
        
        if (nome == null) {
            
            throw new DadoInvalidoException("Por favor preeencha o Nome, o campo é obrigatório!");
            
        }
        
        this.nome = nome;
        
    }

    public void setEndereco(String endereco) {
        
        if (endereco == null) {
            
            throw new DadoInvalidoException("Por favor preencha o Endereço, o campo é obrigatório!");
            
        }
        
        if (endereco instanceof String) {
            
            this.endereco = endereco;
            
        } else {
            
            throw new DadoInvalidoException("Endereço em formato errado, precisa ser uma String!");
            
        }
        
    }

    public void setDataNascimento(String dataNascimento) {
        
        if (dataNascimento == null) {
            
            throw new DadoInvalidoException("O campo Data de Nascimento é necessário");
            
        }
        
        if (dataNascimento instanceof String) {
            
            this.dataNascimento = dataNascimento;
            
        } else {
            
            throw new DadoInvalidoException("A data de nascimento precisa estar no formato de String");
            
        }
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }
}
