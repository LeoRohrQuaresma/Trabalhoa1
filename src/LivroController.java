import java.util.ArrayList;

public class LivroController {
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                livros.remove(livro);
                break;
            }
        }
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}
