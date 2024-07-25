class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return Integer.compare(this.idade, outraPessoa.idade);
    }

    //Getters

    public String getnome() {
        return nome;
    }
    public int getidade() {
        return idade;
    }
    public Double getaltura() {
        return altura;
    }

    // Getters e Setters (não mostrados aqui)

    @Override
    public String toString() {
        return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", altura=" + altura +
        '}';
    }
}
