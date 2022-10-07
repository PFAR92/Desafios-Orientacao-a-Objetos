public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Visualizacao vi[] = new Visualizacao[5];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 10 de SQL");

        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita"); 

        vi[0] = new Visualizacao(g[0], v[2]);
        vi[0].avaliar();
        System.out.println(vi[0]);
        System.out.println("-------------------");

        vi[1] = new Visualizacao(g[0], v[1]);
        vi[1].avaliar(87.0f);
        System.out.println(vi[1]);




    }
}
