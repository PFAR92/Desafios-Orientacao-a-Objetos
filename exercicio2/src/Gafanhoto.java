public class Gafanhoto extends Pessoa{
    public Gafanhoto(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        //TODO Auto-generated constructor stub
    }

    private String login;
    private int totAssistido;

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected void ganharExperiencia() {
        // TODO Auto-generated method stub
        
    }

    
    
}
