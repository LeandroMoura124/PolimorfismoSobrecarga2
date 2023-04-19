public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Lobo l = new Lobo();
        // l.emitirSom();

        Cachorro c = new Cachorro();
        c.setCorPelo("Cinza");
        c.reagir(true);
        c.reagir(false);
        c.reagir(13, 0);
        c.reagir("Sai daqui");
        c.reagir(true);

    }
}
