import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Escola {
    private String nome, CNPJ;
    private String endereco;
    private List<Estudante> discentes;

    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.discentes = new ArrayList<Estudante>();
    }

    public void matricularEstudante(Estudante novoEstudante) {
        discentes.add(novoEstudante);
    }

    public void trancarMatricula(Estudante estudante) {
        discentes.remove(estudante);
    }

    // public void agruparEstudantes() {
    // Map<String, List<Estudante>> agrupamento = new HashMap<>();
    // for (Estudante e : discentes) {
    // if (!agrupamento.containsKey(e.recuperarNaturalidade())) {
    // agrupamento.put(e.recuperarNaturalidade(), new ArrayList<>());
    // }
    // agrupamento.get(e.recuperarNaturalidade()).add(e);
    // }
    // System.out.println("Resultado do agrupamento por naturalidade: " +
    // agrupamento);
    // }

    public void agruparEstudantes() {
        Map<String, List<Estudante>> agrupamento = discentes.stream()
                .collect(Collectors.groupingBy(Estudante::recuperarNaturalidade));
        System.out.println("Resultado do agrupamento por naturalidade: ");
        agrupamento.forEach((String chave, List<Estudante> lista) -> System.out.println(chave + " = " + lista));
    }
}
