import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class criaMenu {
    
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        int acao;
        System.out.println("1 - Para cadastrar novo cliente.");
        System.out.println("2 - Para buscar um cliente pelo nome.");
        System.out.println("3 - Para buscar um cliente pelo CPF.");
        System.out.println("4 - Para excluir um cliente.");
        System.out.println("5 - Para listar clientes.");
        acao = teclado.nextInt();
        
        if(acao == 1){
            
            String cpf;
            String nome;
            String endereco;
            String dataNascimento;
            System.out.println("Informe o CPF do cliente: ");
            cpf = teclado.nextLine();
            
            System.out.println("Informe o nome do cliente: ");
            nome = teclado.nextLine();
            
            System.out.println("Informe o endereço do cliente: ");
            endereco = teclado.nextLine();
            
            System.out.println("Informe a data de nascimento do cliente: ");
            dataNascimento = teclado.nextLine();
            
            try{
                
            CadastroCliente.inserir(new Cliente(cpf, nome, endereco, dataNascimento));
                
            }
            
            catch (ClienteInexistenteException err){
                
                System.out.println("O cliente foi cadastrado com sucesso!");
                
            }
            
        }
        
        else if(acao == 2){
            
            System.out.println("Informe o nome do cliente: ");
            String nome = teclado.nextLine();
            
            ArrayList<Cliente> clientes = new ArrayList<Cliente>();
            
            try{
                
                clientes = CadastroCliente.buscar_nome(nome);
                for(Cliente cliente : clientes)
                System.out.println(cliente);
                
            } catch (ClienteInexistenteException err){
                
                System.out.println(err);
                
            }
            
        }
        else if(acao ==3){
            
            String cpf;
            System.out.println("Informe o CPF do cliente: ");
            cpf = teclado.nextLine();
            Cliente cliente = new Cliente();
            
            try{
                
                cliente = CadastroCliente.buscar_cpf(cpf);
                System.out.println(cliente);
                
            }catch (ClienteInexistenteException err){
                
                System.out.println(err);
                
            }
            
        }
        else if(acao == 4){
            
            String cpf;
            System.out.println("Informe o CPF do cliente: ");
            cpf = teclado.nextLine();
            boolean corretamente = CadastroCliente.excluir(cpf);
            
            if(corretamente){
                
                System.out.println("Cliente excluido!");
                
            }else{
                
                System.out.println("Não foi possivel executar a exclusão do cliente!");
                
            }
            
        }
        else if(acao == 4){
            
            try{
                
                CadastroCliente.listar();
                
            } catch (ClienteInexistenteException err){
                
                System.out.println(err);
                
            }
            
        }
        teclado.close();
    }
}
