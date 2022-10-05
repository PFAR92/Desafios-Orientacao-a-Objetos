public class App {
    public static void main(String[] args) throws Exception {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Visitante p4 = new Visitante();

        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p4.setSexo("F");

        p2.setIdade(18);
        p2.setCurso("Informática");

        p3.setSalário(2500.75f);

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
