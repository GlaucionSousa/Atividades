public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenador = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenador.adicionarPessoa("Alice", 30, 1.65);
        ordenador.adicionarPessoa("Bob", 25, 1.80);
        ordenador.adicionarPessoa("Carol", 22, 1.70);

        // Ordenando por idade
        ordenador.ordenarPoridade();
        System.out.println("Ordenado por idade:");
        for (Pessoa pessoa : ordenador.getpessoas()) {
            System.out.println(pessoa.getnome() + " - Idade: " + pessoa.getidade());
        }

        // Ordenando por altura
        ordenador.ordenarPoraltura();
        System.out.println("\nOrdenado por altura:");
        for (Pessoa pessoa : ordenador.getpessoas()) {
            System.out.println(pessoa.getnome() + " - Altura: " + pessoa.getaltura());
        }

        // Ordenando por nome
        ordenador.ordenarPornome();
        System.out.println("\nOrdenado por nome:");
        for (Pessoa pessoa : ordenador.getpessoas()) {
            System.out.println("Nome: " + pessoa.getnome());
        }
    }
}
