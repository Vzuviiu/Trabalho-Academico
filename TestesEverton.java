public class TestesEverton extends MecanicasDoJogo{

    /**
     * Teste de metodos da classe mecanica
     * 
     */
    public static void main(String[] args) {
        MecanicasDoJogo cientista = new MecanicasDoJogo();
        int vida;
        int inteligencia;
        int furtividade;
        int forca;
        cientista.setClasseSoldado();

        vida = cientista.getVida();
        forca = cientista.getForca();
        inteligencia = cientista.getInteligencia();
        furtividade = cientista.getFurtividade();
        

        System.out.println("Sua vida atual: " + vida + "\nForça: " + forca + " \nInteligência: " + inteligencia + "\nFurtividade: " + furtividade);
        
         vida = cientista.damage();
         System.out.println(vida);
        
         System.out.println(vida);
       
      
    }
}