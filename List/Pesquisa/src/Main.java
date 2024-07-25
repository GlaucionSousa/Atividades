import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um catálogo de livros
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando alguns livros
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogo.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        catalogo.adicionarLivro("O Guarani", "José de Alencar", 1857);
        catalogo.adicionarLivro("Iracema", "José de Alencar", 1865);

        // Pesquisando livros por autor
        List<Livro> livrosDoMachado = catalogo.pesquisarPorAutor("Machado de Assis");
        System.out.println("Livros de Machado de Assis:");
        for (Livro livro : livrosDoMachado) {
            System.out.println(livro);
        }

        // Pesquisando livros por intervalo de anos
        List<Livro> livrosEntre1850e1900 = catalogo.pesquisarPorIntervaloAnos(1850, 1900);
        System.out.println("\nLivros entre 1850 e 1900:");
        for (Livro livro : livrosEntre1850e1900) {
            System.out.println(livro);
        }

        // Pesquisando livro por título
        Livro livroEncontrado = catalogo.pesquisarPorTitulo("Dom Casmurro");
        if (livroEncontrado != null) {
            System.out.println("\nLivro encontrado: " + livroEncontrado);
        } else {
            System.out.println("\nNenhum livro encontrado com o título especificado.");
        }
    }
}
