public class Mamifero extends Animal {
    protected String corPelo;

    @Override // definindo o emitir som do mamifero
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
