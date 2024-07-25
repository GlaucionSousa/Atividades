import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPoridade() {
        Collections.sort(pessoas);
    }

    public void ordenarPornome() {
        Collections.sort(pessoas);
    }

    public void ordenarPoraltura() {
        Collections.sort(pessoas, Comparator.comparingDouble(Pessoa::getaltura));
    }

    public List<Pessoa> getpessoas() {
        return pessoas;
    }
}