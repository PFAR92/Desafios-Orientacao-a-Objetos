public class Professor extends Pessoa{
    private String especialidade;
    private float salário;

    public void receberAumento(){

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalário() {
        return salário;
    }

    public void setSalário(float salário) {
        this.salário = salário;
    }

    @Override
    public String toString() {
        return "Professor [especialidade=" + especialidade + ", salário=" + salário + "]";
    }

    
    
}
