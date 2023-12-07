import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner ler =  new Scanner(System.in);

        int cont = 0;
        int opcao;
        GerenciadorDeLivros gl = new GerenciadorDeLivros();

        while(cont != 1) {

            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Exibir Livro");
            System.out.println("4 - Listar todos os livros");
            System.out.println("5 - Sair");

            switch (opcao) {
                case 1:
                    System.out.println("Informe os dados do livro:");

                    System.out.println("Titulo:");
                    String titulo = ler.nextLine();

                    System.out.println("Ano:");
                    int ano = ler.nextInt();

                    System.out.println("Autor:");
                    String autor = ler.nextLine();

                    gl.addLivro(titulo, ano, autor);
                    System.out.println("Livro cadastrado com sucesso");
                    break;

                case 2:
                    System.out.println("Informe o titulo do livro:");

                    titulo = ler.nextLine();
                    int retorno = gl.removerLivro(titulo);
                        if(retorno == 1) {
                            System.out.println("Livro removido com sucesso.");
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                    break;

                case 3:
                    System.out.println("Informe o titulo do livro:");

                    titulo = ler.nextLine();
                    int exibir = gl.ExibirLivro(titulo);
                        if(exibir == 1) {
                            System.out.println("Livro:");
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                    break;
            }
        }
    }
}
