public class Main{

    public static void main (String[] args){

        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Lucas";
        pessoa.idade = 10;

        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("Idade Antes dos aniversarios: "+ pessoa.idade);

        pessoa.aniversario(pessoa);
        pessoa.aniversario(pessoa);
        pessoa.aniversario(pessoa);
        pessoa.aniversario(pessoa);

        System.out.println("Nome: "+ pessoa.nome);
        System.out.println("Idade depois dos aniversarios: "+ pessoa.idade);

    }

}