interface Ave {
    void voar();
    void emitirSom();
}

class Pato implements Ave {
    public void voar() {
        System.out.println("bate as asas");
    }
    
    public void emitirSom() {
        System.out.println("quack, quack...");
    }
}

class PatoDomestico extends Pato {
    @Override
    public void emitirSom() {
        System.out.println("QUACK QUACK");
    }
}

class Pavao {
    public void cantar() {
        System.out.println("aaAA aaAA aAA");
    }
}

class PavaoAdapter implements Ave {
    private Pavao pavao;
    
    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }
    
    public void voar() {
        System.out.println("O pavão não pode voar.");
    }
    
    public void emitirSom() {
        pavao.cantar();
    }
}

class PavaoAzul extends Pavao {
    @Override
    public void cantar() {
        System.out.println("AAAA AAAAA AAAAA");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Ave pato = new Pato();
        Ave patoDomestico = new PatoDomestico();
        Ave pavaoAdaptado = new PavaoAdapter(new Pavao());
        Ave pavaoAzulAdaptado = new PavaoAdapter(new PavaoAzul());
        
        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();
        
        System.out.println("\nPato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();
        
        System.out.println("\nPavão:");
        pavaoAdaptado.voar();
        pavaoAdaptado.emitirSom();
        
        System.out.println("\nPavão Azul:");
        pavaoAzulAdaptado.voar();
        pavaoAzulAdaptado.emitirSom();
    }
}