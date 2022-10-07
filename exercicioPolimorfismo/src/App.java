public class App {
    public static void main(String[] args) throws Exception {

        Cachorro ca = new Cachorro();
        Lobo lo = new Lobo();

        ca.emitirSom();
        lo.emitirSom();

        ca.reagir("Olá");
        ca.reagir("Vai apanhar");
        ca.reagir(11, 45);
        ca.reagir(21, 0);
        ca.reagir(true);
        ca.reagir(false);
        ca.reagir(2, 12.5f);
        ca.reagir(17, 4.5f);




    }
}
