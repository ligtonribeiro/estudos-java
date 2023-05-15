import java.util.Calendar;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, Calendar data_nascimento, long CPF, String endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }
}
