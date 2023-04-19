public class Lobo extends Mamifero{
    private String corPelo;

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public String getCorPelo() {
        return corPelo;
    }
    @Override
    public void emitirSom(){
        System.out.println("AUUUUUUUUUUUUUUUUUU!");
    }
}
