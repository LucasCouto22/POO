import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int acao;
        ArrayList<Abrigo> abrigos = new ArrayList<Abrigo>();
        ArrayList<Adotante> adotantes = new ArrayList<Adotante>();
        ArrayList<Animal> animais = new ArrayList<Animal>();
        boolean isRunning = true;
        while(isRunning){
            clrscr();
            System.out.println("0 - Registrar um abrigo");
            System.out.println("1 - Listar abrigos");
            System.out.println("2 - Criar um adotante");
            System.out.println("3 - Registrar um adotante");
            System.out.println("4 - Listar Adotantes");
            System.out.println("5 - Criar um animal");
            System.out.println("6 - Registrar um animal");
            System.out.println("7 - Listar todos os animais de um abrigo");
            System.out.println("8 - Adotar um animal");
            System.out.println("9 - Fechar o programa");
            acao = teclado.nextInt();
            if(acao == 0){
                clrscr();
                String nomeAbrigo;
                String nomeDono;
                System.out.println("Digite o nome do abrigo:");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do dono:");
                nomeDono = teclado.next();
                abrigos.add(new Abrigo(nomeAbrigo, nomeDono));
                System.out.println("Abrigo cadastrado com sucesso!");
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();

            }else if(acao == 1){
                clrscr();
                int i = 1;
                for(Abrigo abrigo : abrigos){
                    System.out.println(Integer.toString(i) + " - " + abrigo.getNomeAbrigo());
                    i++;
                }
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();
            }else if(acao == 2){
                clrscr();
                String nome;
                String cpf;
                String endereco;
                System.out.println("Digite o nome do adotante:");
                nome = teclado.next();
                System.out.println("Agora digite o CPF:");
                cpf = teclado.next();
                System.out.println("Por fim, digite o endereco:");
                endereco = teclado.next();
                Adotante Adotante = new Adotante(nome, cpf, endereco);
                adotantes.add(Adotante);
                System.out.println("Adotante criado com sucesso!");
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();

            }else if(acao == 3){
                clrscr();
                boolean abrigoExiste = false;
                boolean adotanteExiste = false;
                String nomeAbrigo;
                String nomeAdotante;
                System.out.println("Digite o nome do abrigo para registrar o adotante:");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do adotante a ser registrado:");
                nomeAdotante = teclado.next();
                for(Abrigo abrigo : abrigos){
                    if(nomeAbrigo.equals(abrigo.getNomeAbrigo())){
                        abrigoExiste = true;
                        for(Adotante adotante : adotantes){
                            if(nomeAdotante.equals(adotante.getNome())){
                                adotanteExiste = true;
                                abrigo.registrarAdotante(adotante);
                            }
                        }
                    }
                }
                if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe!");
                }else if(!adotanteExiste){
                    System.out.println("O adotante digitado não existe!");
                }else{
                    System.out.println("O adotante foi registrado com sucesso!");
                }
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();
            }else if(acao == 4){
                clrscr();
                int i = 1;
                for(Adotante adotante : adotantes){
                    System.out.println(Integer.toString(i) + " - " + adotante.getNome());
                    i++;
                }
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();

            }else if(acao == 5){
                clrscr();
                String nome;
                int animal;
                String raca;
                String cor;
                int idade = 0;
                System.out.println("Digite o nome do animal:");
                nome = teclado.next();
                System.out.println("Qual a tipo?");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Gato");
                animal = teclado.nextInt();
                System.out.println("Qual é a raça do animal? Se não souber deixe em branco.");
                raca = teclado.next();
                System.out.println("Qual a cor do animal?");
                cor = teclado.next();
                System.out.println("Qual a idade do animal em anos? Se não souber digite 0 (APENAS NUMEROS).");
                idade = teclado.nextInt();
                if(animal == 1){
                    if(raca == "" && idade == 0){
                        Animal Animal = new Animal(nome, "Cachorro", cor);
                        animais.add(Animal);
                    }else if(raca == ""){
                        Animal Animal = new Animal(nome, "Cachorro", cor, idade);
                        animais.add(Animal);
                    }else if(idade == 0){
                        Animal Animal = new Animal(nome, "Cachorro", raca, cor);
                        animais.add(Animal);
                    }else{
                        Animal Animal = new Animal(nome, "Cachorro", raca, cor, idade);
                        animais.add(Animal);
                    }
                }else{
                    if(raca == "" && idade == 0){
                        Animal Animal = new Animal(nome, "Gato", cor);
                        animais.add(Animal);
                    }else if(raca == ""){
                        Animal Animal = new Animal(nome, "Gato", cor, idade);
                        animais.add(Animal);
                    }else if(idade == 0){
                        Animal Animal = new Animal(nome, "Gato", raca, cor);
                        animais.add(Animal);
                    }else{
                        Animal Animal = new Animal(nome, "Gato", raca, cor, idade);
                        animais.add(Animal);
                    }
                }
                System.out.println("O animal foi criado com sucesso!");
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();

            }else if(acao == 6){
                clrscr();
                boolean abrigoExiste = false;
                boolean animalExiste = false;
                String nomeAbrigo;
                String nomeAnimal;
                System.out.println("Digite o nome do abrigo para registrar o animal:");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do animal a ser registrado:");
                nomeAnimal = teclado.next();
                for(Abrigo abrigo : abrigos){
                    if(nomeAbrigo.equals(abrigo.getNomeAbrigo())){
                        abrigoExiste = true;
                        for(Animal animal : animais){
                            if(nomeAnimal.equals(animal.getNome())){
                                animalExiste = true;
                                abrigo.registrarAnimal(animal);
                            }
                        }
                    }
                }
                if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe!");
                }else if(!animalExiste){
                    System.out.println("O animal digitado não existe!");
                }else{
                    System.out.println("O animal foi registrado com sucesso!");
                }
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();

            }else if(acao == 7){
                clrscr();
                boolean abrigoExiste = false;
                String nomeAbrigo;
                System.out.println("Digite o nome do abrigo para listar os animais:");
                nomeAbrigo = teclado.next();
                for(Abrigo abrigo : abrigos){
                    if(nomeAbrigo.equals(abrigo.getNomeAbrigo())){
                        abrigoExiste = true;
                        abrigo.listarAnimais();
                    }
                }
                if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe!");
                }
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();

            }else if(acao == 8){
                clrscr();
                boolean abrigoExiste = false;
                boolean animalExiste = false;
                boolean adotanteExiste = false;
                String nomeAbrigo;
                String nomeAdotante;
                String nomeAnimal;
                System.out.println("Digite o nome do abrigo onde o animal esta:");
                nomeAbrigo = teclado.next();
                System.out.println("Digite o nome do adotante:");
                nomeAdotante = teclado.next();
                System.out.println("Digite o nome do animal:");
                nomeAnimal = teclado.next();
                for(Adotante adotante : adotantes){
                    if(nomeAdotante.equals(adotante.getNome())){
                        adotanteExiste = true;
                        for(Abrigo abrigo : abrigos){
                            if(nomeAbrigo.equals(abrigo.getNomeAbrigo())){
                                abrigoExiste = true;
                                for(Animal animal : abrigo.getAnimais()){
                                    if(nomeAnimal.equals(animal.getNome())){
                                        animalExiste = true;
                                        abrigo.adotarAnimal(adotante, animal);
                                    }
                                }
                            }
                        }
                    }
                }
                if(!adotanteExiste){
                    System.out.println("O adotante digitado não existe!");
                }else if(!abrigoExiste){
                    System.out.println("O abrigo digitado não existe!");
                }else if(!animalExiste){
                    System.out.println("O animal digitado não esta nesse abrigo ou não existe!");
                }else{
                    System.out.println("O animal foi adotado com sucesso!");
                }
                System.out.println("\nAperte Enter para voltar ao menu.");
                System.in.read();

            }else if(acao == 9){
                isRunning = false;
            }
        }
        teclado.close();
    }


    public static void clrscr(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }



    /*

    Questão A: 
    
    No nosso trabalho, fizemos o uso de Arraylists para salvar apenas em memória com ArrayLists onde depois do fim da execução do pragrama o conteúdo é perdido,
    então, acredito que consiga fazer a persistência dos meus arquivos em bancos de dados com esse vetor passando juntamente informações chave para localização dentro
    do vetor. 
    No nosso pensamento para um ponto crítico do nosso sistema que são os animais, falhamos em não ter um indentificador, onde o maior identificador é o nome do 
    animal que posso ser repetido, impossibilitanto a localização do mesmo, isso seria algo a ser alterado.
    Poderiamos ter utilizado também arquivos para gravar as informações, onde não perderiamos as informações após o fim da execução, além disso poderiamos pensar melhor 
    na lozalização de conteúdo nesses aquivos adicionando identificadores por linha.
    Acredito que nossa aplicação pode ser muito melhorada com o uso de outras formas de salvar informações, porém para uma forma primitidade de persistência de dados em um banco de dados
    relacional ela não é de todo ruim.


    Questão B: 

    As classes criadas para persistência foram as AnimalBD e AdotanteBD,

    Com isso, eu fiz uma modificação no código para que Adotante virasse uma variárel nas linhas 58 e 59 aqui em App.java
    Para inserir um adotante eu vou passar chamar a classe AdotanteBD e o método inserir() da seguinte forma "AdotanteBD.inserir(Adotante);" que ficaria na linha 60.
    Com isso eu persisto o meu Adotante na minha tabela Adotante.

    Para a classe AnimalBD da linha 123 a 149 eu também fiz alterações para que se encaixasse no código criando um Animal para depois inseri-lo. 
    Fazendo assim, ficaria da seguinte forma "AnimalBD.inserir(Animal);", passando o animal como parâmetro para inserção chamando a classe AnimalBD e o método Inserir.
    Esse exemplo ficaria na linha 151 após a crição do animal.


    OBS:

    Eu criaria o arquivo previamente e informaria o caminho de cada arquivo para o qual eu quero inserir algo, depois eu chamaria a classe que criei "Arquivo.java",
    dentro dela e tenho dois métodos, um para ler onde eu passaria o caminho do arquivo e dentro desse método eu faria a leitura e retorno do arquivo.
    Já para escrita eu passo o meu caminho também e uma String que é o que quero escrever no meu arquivo, dentro do meu método eu tenho minha regra para o arquivo que vai 
    dizer a minha regra para escrita no arquivo.


    */
    
}
