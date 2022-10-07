public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 10 de SQL");

        for(Video videos : v) System.out.println(videos);



    }
}
