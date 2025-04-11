class Amplificador {
   void ligar() { System.out.println("Amplificador ligado."); }
   void desligar() { System.out.println("Amplificador desligado."); }
   void ajustarVolume(int volume) { System.out.println("Volume ajustado para " + volume); }
}
class Luzes {
   void ligar() { System.out.println("Ligando a luz..."); }
   void desligar() { System.out.println("Luzes apagadas!"); }
}
class MaquinaPipoca {
   void ligar() { System.out.println("Pipoqueira ligada."); }
   void desligar() { System.out.println("Pipoqueira desligada :("); }
   void rebentarPipoca() { System.out.println("Pipoca estourando :D"); }
}
class Projetor {
   void ligar() { System.out.println("Projetor ligando..."); }
   void desligar() { System.out.println("Projetor desligado!"); }
}
class Telao {
   void abaixar() { System.out.println("Telão abaixado."); }
   void subir() { System.out.println("Telão subindo."); }
}

class PlayerStreaming {
   void ligar() { System.out.println("Player de streaming ligado."); }
   void desligar() { System.out.println("Player de streaming desligado."); }
   void play(String filme) { System.out.println("Reproduzindo: " + filme); }
   void stop() { System.out.println("Filme pausado."); }
}
 
class HomeTheaterFacade {
   private MaquinaPipoca pipoqueira;
   private Luzes luzes;
   private Telao telao;
   private Projetor projetor;
   private Amplificador amplificador;
   private PlayerStreaming player;
   
   public HomeTheaterFacade() {
       this.pipoqueira = new MaquinaPipoca();
       this.luzes = new Luzes();
       this.telao = new Telao();
       this.projetor = new Projetor();
       this.amplificador = new Amplificador();
       this.player = new PlayerStreaming();
   }
   
   public void iniciarFilme(String filme) {
       System.out.println("\nPreparando para assistir ao filme...");
       pipoqueira.ligar();
       pipoqueira.rebentarPipoca();
       luzes.desligar();
       telao.abaixar();
       projetor.ligar();
       amplificador.ligar();
       amplificador.ajustarVolume(10);
       player.ligar();
       player.play(filme);
       System.out.println("Filme iniciado!\n");
   }
   public void fimDoFilme() {
       System.out.println("\nFinalizando a sessão de cinema...");
       player.stop();
       player.desligar();
       amplificador.desligar();
       projetor.desligar();
       telao.subir();
       luzes.ligar();
       pipoqueira.desligar();
       System.out.println("Sessão encerrada!\n");
   }
}
 
public class Test {
   public static void main(String[] args) {
       
       HomeTheaterFacade homeTheater = new HomeTheaterFacade();

       homeTheater.iniciarFilme("Hotel Transilvânia");
       homeTheater.fimDoFilme();
   }
}