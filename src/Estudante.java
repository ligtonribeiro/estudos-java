public class Estudante {
    private String matricula, nome, naturalidade;

    public Estudante(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", nome, naturalidade);
    }

    public String recuperarNaturalidade() {
        return this.naturalidade;
    }
}
