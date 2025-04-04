interface Bebida {
    String getDescricao();
    double calculaCusto();
}

class Espresso implements Bebida {
    public String getDescricao() {
        return "Café Espresso";
    }

    public double calculaCusto() {
        return 4.0;
    }
}

class Decaf implements Bebida {
    public String getDescricao() {
        return "Café Descafeinado";
    }

    public double calculaCusto() {
        return 3.5;
    }
}

abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}

class Leite extends BebidaDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    public String getDescricao() {
        return bebida.getDescricao() + " com leite";
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 1.0;
    }
}

class Canela extends BebidaDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    public String getDescricao() {
        return bebida.getDescricao() + " com canela";
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 0.5;
    }
}

class Chocolate extends BebidaDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    public String getDescricao() {
        return bebida.getDescricao() + " com chocolate";
    }

    public double calculaCusto() {
        return bebida.calculaCusto() + 1.5;
    }
}

public class Cafeteria {
    public static void main(String[] args) {
        Bebida pedido1 = new Chocolate(new Leite(new Espresso()));
        System.out.println("Pedido 1: " + pedido1.getDescricao());
        System.out.println("Custo: R$" + pedido1.calculaCusto());
        System.out.println();

        Bebida pedido2 = new Canela(new Leite(new Decaf()));
        System.out.println("Pedido 2: " + pedido2.getDescricao());
        System.out.println("Custo: R$" + pedido2.calculaCusto());
        System.out.println();

        Bebida pedido3 = new Chocolate(new Canela(new Leite(new Decaf())));
        System.out.println("Pedido 3: " + pedido3.getDescricao());
        System.out.println("Custo: R$" + pedido3.calculaCusto());
    }
}