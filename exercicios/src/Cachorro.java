public class Cachorro {
    String nome;
    String cor;
    String raca;
    int idade;
    boolean latindo;
    boolean brincando;

    void brincando(){
        if(latindo == true) System.out.println("Não ele está latindo");
    else System.out.println("Sim");
    }

    void correndo(){
        if(brincando == true || latindo == true) System.out.println("Não ele está ocupado");
        else System.out.println("Sim ele pode correr");
    }
    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Raca: " + this.raca);
        
    }
}
