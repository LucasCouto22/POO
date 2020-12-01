public class App {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Arthur";
        pessoa.idade = 20;

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);

        pessoa.fazerAniversario();

        System.out.println(pessoa.idade);
        pessoa.fazerAniversario();
        System.out.println(pessoa.idade);
    }
}
