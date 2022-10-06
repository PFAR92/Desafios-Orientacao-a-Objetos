public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();

        Cancuru cg = new Cancuru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        Goldfish go = new Goldfish();
        Arara ar = new Arara();
        cg.locomover();
        ca.locomover();
    }
}
