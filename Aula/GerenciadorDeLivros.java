import java.util.ArrayList;

public class GerenciadorDeLivros {
    private ArrayList<Livro> acervo = new ArrayList<Livro>();

    public ArrayList getAcervo() {
        return acervo;
    }

    public int addLivro(String titulo, int ano, String autor) {
        Livro l = new Livro(titulo, ano, autor);
        this.acervo.add(l);
        return 1;
    }

    public void addLivro(Livro l) {
        this.acervo.add(l);
    }

    public int removerLivro(String titulo) {
        for(Livro livro: acervo) {
            if(livro.getTitulo().equals(titulo)) {
                this.acervo.remove(livro);
                return 1;
            }
        }
        return 0;
    }

    public int ExibirLivro(String titulo) {
        for(Livro l : acervo) {
            if(l.getTitulo().equals(titulo)) {
                System.out.println("Livro: " + l.getTitulo());
                System.out.println("Ano de Publicação: " + l.getAnoPublicacao());
                System.out.println("Autor: " + l.getAutor());

                return 1;
            }
        }
        return 0;
    }

    public void exibirListaLivros() {
        for (Livro l : acervo) {
            System.out.println("**************************");
            System.out.println("Livro: " + l.getTitulo());
            System.out.println("Ano de publicação: " + l.getAnoPublicacao());
            System.out.println("Autor: " + l.getAutor());
        }
    }
}
