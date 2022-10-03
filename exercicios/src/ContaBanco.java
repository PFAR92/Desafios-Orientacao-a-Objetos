public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(Float d) {
        this.saldo = d;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t.equals("CC")) this.setSaldo(50f);
        if(t.equals("CP")) this.setSaldo(150f);
        
    }
    public void fecharConta(){
        if(this.getSaldo() != 0f) {
            System.out.println("ERRO!!! sua conta tem que estar zerada para fechar");
            if(this.getSaldo() < 0) System.out.println("Existem débitos pendentes");
            else System.out.println("Existem valores a serem sacados");
        }else this.setStatus(false);
    }

    public void depositar(float v){
        if(this.isStatus() == false) System.out.println("Essa conta não está aberta");
        else {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
    }

    public void sacar(float f){
        if(this.isStatus() == false) System.out.println("Essa conta não está aberta");
        if(this.getSaldo() > f) {
            this.setSaldo(this.getSaldo() - f);
            System.out.println("Saque realizado na conta de " + this.getDono());
        }else System.out.println("Saldo insuficiente");         

    }

    public void pagarMensal(){
        if(this.isStatus() == false) System.out.println("Essa conta não está aberta");
        if(this.getTipo() == "CC") this.setSaldo(this.getSaldo() - 12f);
        else if(this.getTipo() == "CP") this.setSaldo(this.getSaldo() - 20f);

    }

    public void estadoAtual(){
        System.out.println("================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());    
    }
    
    

    

}
