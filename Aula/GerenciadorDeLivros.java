import java.util.ArrayList;

public class GerenciadorDeLivros {
    private ArrayList<Livro> acervo = new ArrayList<Livro>();

    public ArrayList getAcervo() {
        return acervo;
    }

    public void addLivro(String titulo, int ano, String autor) {
        Livro l = new Livro(titulo, ano, autor);
        this.acervo.add(l);
    }

    public void addLivro(Livro l) {
        this.acervo.add(l);
    }

    public void removerLivro(String titulo) {
        for(Livro livro: acervo) {
            if(livro.getTitulo().equals(titulo)) {
                this.acervo.remove(livro);
            } else {
                System.out.println("Livro não encontrado.");
            }
        }
    }
    
}
