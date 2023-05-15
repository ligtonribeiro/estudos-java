import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private String endereco;

    public Pessoa(String nome, Calendar data_nascimento, long CPF, String endereco) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    protected void atualizarNome(String nome) {
        this.nome = nome;
    }

    protected String recuperarNome() {
        return this.nome;
    }

    protected void atualizarIdade() {
        this.idade = calcularIdade();
    }

    protected int recuperarIdade() {
        return this.idade;
    }

    protected void atualizarCPF(long CPF) {
        this.CPF = CPF;
    }

    protected String recuperarEndereco() {
        return this.endereco;
    }

    private int calcularIdade() {
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(Calendar.YEAR) - data_nascimento.get(Calendar.YEAR);

        if ((data_nascimento.get(Calendar.MONTH) > hoje.get(Calendar.MONTH))
                || (data_nascimento.get(Calendar.MONTH)) == hoje.get(Calendar.MONTH)
                        && data_nascimento.get(Calendar.DATE) > hoje.get(Calendar.DATE))
            lapso--;
        return lapso;
    }
}
