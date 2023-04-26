import java.util.ArrayList;

public class BibliotecaView {
    public void mostrarLivros(ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println("ID: " + livro.getId());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println();
        }
    }
}
