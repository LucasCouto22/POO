public class Cliente {
    
    private String CPF;
    private String nome;
    private String endereco;
    private String dataNascimento;

    public void setCPF(String CPF) {
        
        if (CPF == null) {
            
            throw new DadoInvalidoException("CPF vazio, você precisa forneceder um CPF!");
            
        }
        
        if (CPF instanceof String) {
            
            this.CPF = CPF;
            
        } else {
            
            throw new DadoInvalidoException("Formato errado do CPF, precisa ser uma String");
            
        }

    }

    public void setNome(String nome) {
        
        if (nome == null) {
            
            throw new DadoInvalidoException("Nome vazio, você precisa fornecedor um Nome!");
            
        }
        
        this.nome = nome;
        
    }

    public void setEndereco(String endereco) {
        
        if (endereco == null) {
            
            throw new DadoInvalidoException("Endereço vazio, você precisa fornecer um Endereço!");
            
        }
        
        if (endereco instanceof String) {
            
            this.endereco = endereco;
            
        } else {
            
            throw new DadoInvalidoException("Endereço em formato errado, precisa ser uma String!");
            
        }
    }

    public void setDataNascimento(String dataNascimento) {
        
        if (dataNascimento == null) {
            
            throw new DadoInvalidoException("Data de Nascimento vazia, você precisa fornecer uma Data de Nascimento!");
            
        }
        
        if (dataNascimento instanceof String) {
            
            this.dataNascimento = dataNascimento;
            
        } else {
            
            throw new DadoInvalidoException("Data de Nascimento em formato errado, precisa ser uma String!");
            
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
