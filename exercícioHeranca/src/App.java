public class App {
    public static void main(String[] args) throws Exception {
        Aluno p2 = new Aluno();
        Visitante p4 = new Visitante();

        p4.setNome("Juvenal");
        p4.setIdade(22);
        p4.setSexo("M");

        p2.setNome("Claudio");
        p2.setMatricula(111);
        p2.setIdade(16);
        p2.setSexo("M");
        p2.pagarMensalidade();

        Bolsista p1 = new Bolsista();
        p1.setMatricula(1112);
        p1.setNome("Jubileu");
        p1.setBolsa(12.5f);
        p1.setSexo("M");
        p1.pagarMensalidade();

    }
}
