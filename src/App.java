public class App {
    private static Estudante estudante1, estudante2, estudante3, estudante4, estudante5, estudante6;
    private static Escola escola;

    public static void main(String[] args) {
        escola = new Escola("Escola Carlota Colares", "42.336.174/0006-13");
        criarEstudantes();
        matricularEstudantes();
        escola.agruparEstudantes();
    }

    public static void criarEstudantes() {
        estudante1 = new Estudante("Wellington Ribeiro", "Crateús");
        estudante2 = new Estudante("Rosimeire Melo", "Crateús");
        estudante3 = new Estudante("Luanny Maria", "Crateús");
        estudante4 = new Estudante("Luan Marx", "Fortaleza");
        estudante5 = new Estudante("Luana Menezes", "Fortaleza");
        estudante6 = new Estudante("Thais Lopes", "Sobral");
    }

    public static void matricularEstudantes() {
        escola.matricularEstudante(estudante1);
        escola.matricularEstudante(estudante2);
        escola.matricularEstudante(estudante3);
        escola.matricularEstudante(estudante4);
        escola.matricularEstudante(estudante5);
        escola.matricularEstudante(estudante6);
    }
}
