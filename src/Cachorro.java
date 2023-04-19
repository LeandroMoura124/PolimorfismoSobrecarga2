public class Cachorro extends Lobo{
    

    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }

    //Metodo sobrecarga do cachorro -- metodos com assinaturas diferentes 
    // Todo metodo se enquadra como sobrecarga se sua assinaturas forem diferentes, 
    //ex a diferenca na quantidade de parametros do metodo e no tipo de dados que se está passando pra var no parametro

    public void reagir(String frase){
        if(frase == "Toma comida" || frase == "Olá"){
            System.out.println("Abanar e latir");
        }
        else if(frase == "Cachorro feio" || frase == "Sai daqui"){
            System.out.println("Rosnar e ficar bravo");
        }
    }

    public void reagir(int hora, int min){// ass diferente
        if(hora < 12 ){
            System.out.println("Abanar");
        }
        else if(hora>=18){
            System.out.println("Ignorar, está de noite");
        }
        else{
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Latir e rosnar");
        }

    }
    public void reagir (int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            }
            else{
                System.out.println("Latir");
            }
        }
        else if(peso < 10){
            System.out.println("Rosnar");
        }
        else{
            System.out.println("Ignorar, dog está veio");
        }

    }
   /*  public void reagir (int x, int y){ ERROO

    }*/
}
