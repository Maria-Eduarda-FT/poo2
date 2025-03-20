class CalculadoraBinaria {
    public String somar(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(num1 + num2);
    }
    
    public String subtrair(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(num1 - num2);
    }
}

interface Calculadora {
    int somar(int a, int b);
    int subtrair(int a, int b);
    int multiplicar(int a, int b);
}

class CalculadoraAdapter implements Calculadora {
    private CalculadoraBinaria calculadoraBinaria;
    
    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }
    
    @Override
    public int somar(int a, int b) {
        String resultadoBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }
    
    @Override
    public int subtrair(int a, int b) {
        String resultadoBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }
    
    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraAdapter(new CalculadoraBinaria());
        
        System.out.println("Soma 5 + 3 = " + calculadora.somar(5, 3));
        System.out.println("Subtração 5 - 3 = " + calculadora.subtrair(5, 3));
        System.out.println("Multiplicação 5 x 3 = " + calculadora.multiplicar(5, 3));
    }
}