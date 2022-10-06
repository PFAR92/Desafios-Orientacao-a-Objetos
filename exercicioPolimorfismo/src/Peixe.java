public class Peixe extends Animal{
    private String corScama;

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substãncias");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
        
    }

    
}
