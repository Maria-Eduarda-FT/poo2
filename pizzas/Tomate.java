public class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Tomate";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 3.0; 
    }
}