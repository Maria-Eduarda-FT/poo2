import java.util.ArrayList;
import java.util.List;

interface PagamentoStrategy {
    void realizarPagamento(double valor);
}
class PixPagamento implements PagamentoStrategy {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}
class CartaoPagamento implements PagamentoStrategy {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Cartão de Crédito.");
    }
}
class BoletoPagamento implements PagamentoStrategy {
    public void realizarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$" + valor + ".");
    }
}

interface FreteStrategy {
    double calculaFrete(double peso);
}
class FreteSedex implements FreteStrategy {
    public double calculaFrete(double peso) {
        return peso * 2.5;
    }
}
class FreteNormal implements FreteStrategy {
    public double calculaFrete(double peso) {
        return peso * 1.2;
    }
}

class Item {
    String nome;
    double preco, peso;
    public Item(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }
}

class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.preco;
        }
        return total;
    }

    public double calculaPesoTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.peso;
        }
        return total;
    }

    public void setPagamentoStrategy(PagamentoStrategy strategy) {
        this.pagamentoStrategy = strategy;
    }

    public void setFreteStrategy(FreteStrategy strategy) {
        this.freteStrategy = strategy;
    }

    public void realizaPagamento() {
        double total = calculaTotal();
        double frete = calculaFrete();
        double totalComFrete = total + frete;
        System.out.println("Valor dos produtos: R$" + total);
        System.out.println("Frete: R$" + frete);
        pagamentoStrategy.realizarPagamento(totalComFrete);
    }

    public double calculaFrete() {
        double peso = calculaPesoTotal();
        return freteStrategy.calculaFrete(peso);
    }
}
public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        Item item1 = new Item("Notebook", 3000.0, 2.0);
        Item item2 = new Item("Mouse", 150.0, 0.3);
        carrinho.adicionaItem(item1);
        carrinho.adicionaItem(item2);
 
        carrinho.setPagamentoStrategy(new CartaoPagamento());
        carrinho.setFreteStrategy(new FreteSedex());
        carrinho.realizaPagamento();
    }
}