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

    public void ordenarPoraltura() {
        Collections.sort(pessoas, Comparator.comparingDouble(Pessoa::getaltura));
    }

    public Pessoa[] getpessoas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPessoas'");
    }

    public Pessoa[] getPessoas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPessoas'");
    }
}