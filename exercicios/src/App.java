public class App {
    public static void main(String[] args) throws Exception {
        
       Caneta c1 = new Caneta();
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.destampar();
       c1.status(); 
       c1.rasbiscar();

       Caneta c2 = new Caneta();
       c2.modelo = "Hostnet";
       c2.cor = "Preta";
       c2.rasbiscar();
       c2.status();
    }
}
