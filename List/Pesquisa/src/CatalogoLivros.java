import java.util.ArrayList;
import java.util.List;

class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // Retorna null se não encontrar nenhum livro com o título especificado
    }
}