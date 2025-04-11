class Motor {
    void ligar() { System.out.println("Ligando o motor..."); }
    void desligar() { System.out.println("Desligando o motor..."); }
 }
 class Farol {
    void ligar() { System.out.println("Ligando o farol..."); }
    void desligar() { System.out.println("Apagando o farol!"); }
 }
 class CintoSeg {
    void travar() { System.out.println("Cinto de Segurança Travado."); }
    void destravar() { System.out.println("Cinto de Segurança Destravado."); }
 }
 class Porta {
    void trancar() { System.out.println("Portas trancadas."); }
    void destrancar() { System.out.println("Portas destrancadas."); }
 }
 
 class Radio {
    void sintoniza() { System.out.println("Rádio ligado e sintonizado."); }
    void desligar() { System.out.println("Rádio desligado."); }
 }
  
 class celtinha {
    private Motor motor;
    private CintoSeg cinto;
    private Porta portas;
    private Farol farol;
    private Radio radio; 
    
    public celtinha() {
        this.motor = new Motor();
        this.cinto = new CintoSeg();
        this.portas = new Porta();
        this.farol = new Farol();
        this.radio = new Radio(); 
    }
    
    public void Dirigir() {
        System.out.println("\nPreparando para dirigir...");
        motor.ligar();
        portas.trancar();
        cinto.travar();
        farol.ligar();
        radio.sintoniza();  
        System.out.println("Dirigindo...\n");
    }
    public void fimCorrida() {
        System.out.println("\nFinalizando a corrida..."); 
        motor.desligar();
        portas.destrancar();
        cinto.destravar();
        farol.desligar();
        radio.desligar(); 
        System.out.println("Corrida encerrada!\n");
    }
 }
  
 public class Test {
    public static void main(String[] args) {
        
        celtinha celta = new celtinha();
 
        celta.Dirigir();
        celta.fimCorrida();
    }
 }