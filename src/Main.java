public class Main {
    public static void main(String[] args) {
        LivroController controller = new LivroController();
        BibliotecaView view = new BibliotecaView();

        // Adicionar alguns livros
        controller.adicionarLivro(new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", "Martins Fontes"));
        controller.adicionarLivro(new Livro(2, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Rocco"));
        controller.adicionarLivro(new Livro(3, "Game of Thrones", "George R.R. Martin", "Leya"));

        // Exibir a lista de livros
        view.mostrarLivros(controller.getLivros());

        // Remover um livro
        controller.removerLivro(1);

        // Exibir a lista de livros novamente
        view.mostrarLivros(controller.getLivros());
    }
}
